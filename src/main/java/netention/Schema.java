package netention;

import netention.schema.Primitive;
import netention.schema.SchemaOrg;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.search.spell.PlainTextDictionary;
import org.apache.lucene.search.spell.SpellChecker;
import org.apache.lucene.search.spell.SuggestWord;
import org.apache.lucene.search.spell.SuggestWordQueue;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/** loaded ontology
 *
 *
 * http://lucene.apache.org/core/7_5_0/suggest/org/apache/lucene/search/suggest/Lookup.html
 * http://lucene.apache.org/core/7_5_0/suggest/org/apache/lucene/search/spell/SpellChecker.html
 * */
public class Schema {


    public final Map<String,NType> byID = new HashMap<>();

    /** aliases, in one or more natural languages */
    public final Map<String,NType> byAlias = new HashMap<>();

    final Directory directory = new RAMDirectory();

    final SpellChecker speller;

    /** intensional inheritance type relationships */
    public final DefaultDirectedWeightedGraph<String, DefaultEdge> inh = new DefaultDirectedWeightedGraph(DefaultEdge.class);

    /** extensional inheritance type relationships */
    public final DefaultDirectedWeightedGraph<String, DefaultEdge> ext = new DefaultDirectedWeightedGraph(DefaultEdge.class);

    /** implication (suggestion/co-occurrence) */
    public final DefaultDirectedWeightedGraph<String, DefaultEdge> impl = new DefaultDirectedWeightedGraph(DefaultEdge.class);

    public static Schema newDefault() {
        Schema s = new Schema();
        Primitive.load(s);
        SchemaOrg.load(s);
        //..



        return s.commit();
    }

    public Schema commit() {
        //TODO some better way
        StringBuilder ss = new StringBuilder(64 * 1024);
        byAlias.keySet().forEach(x -> {
            ss.append(x).append('\n');
        });
        String s = ss.toString();
        PlainTextDictionary dict = new PlainTextDictionary(new StringReader(s));
        try {
            speller.indexDictionary(dict, new IndexWriterConfig(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Schema() {
        try {
            speller = new SpellChecker(directory);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }


    }


    public NType type(String id) {
        return byID.computeIfAbsent(id, i -> {
            NType n = new NType(i);
            byAlias.put(id, n);
            return n;
        });
    }

    public void print() {
        byID.entrySet().forEach(e -> {
            String id = e.getKey();
            System.out.println(id /*e.getValue()*/);
            if (ext.containsVertex(id)) {
                ext.incomingEdgesOf(id).forEach(ee -> {
                    System.out.println("\tin: " + ext.getEdgeSource(ee));
                });
                ext.outgoingEdgesOf(id).forEach(ee -> {
                    System.out.println("\thas: " + ext.getEdgeTarget(ee));
                });
            }
            if (inh.containsVertex(id)) {
                inh.outgoingEdgesOf(id).forEach(ee -> {
                    System.out.println("\tis: " + inh.getEdgeTarget(ee));
                });
                inh.incomingEdgesOf(id).forEach(ee -> {
                    System.out.println("\tcan: " + inh.getEdgeSource(ee));
                });
            }
        });

    }

    /** add edge */
    public void addEdge(Graph g, String a, String b) {
        g.addVertex(a);
        g.addVertex(b);
        g.addEdge(a,   b);
    }


    public Lookup types(String typeName) {
        return types(typeName, 16);
    }

    /** resolve schema types */
    public Lookup types(String typeName, int capacity) {
        Lookup l = new Lookup();
        SuggestWordQueue items = l.items;

        //1. find exact match
        NType exact = byAlias.get(typeName);
        if (exact!=null)
            items.add(suggest(exact.id, 1, 1));

        //2. lookup in spellcheck
        try {
            String[] similar = speller.suggestSimilar(typeName, capacity - (exact != null ? 0 : 1));
            if (similar.length > 0) {
                float baseSimilar = 1f/similar.length;
                for (String s : similar) {
                    items.add(suggest(s, baseSimilar, 1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }

    /** suggests components */
    public Lookup in(String typeID /* Set<String> except */) {
        return null; //TODO
    }

    /** resolution result */
    public class Lookup {

        static final int capacity = 16;

        public final SuggestWordQueue items = new SuggestWordQueue(capacity);

        public Lookup() {


        }

        public void print() {
            for (SuggestWord s : items) {
                System.out.println(s.string + " " + s.score);
            }
        }
    }

    private static SuggestWord suggest(String id, float score, int freq) {
        SuggestWord s = new SuggestWord();
        s.string = id;
        s.freq = freq;
        s.score = score;
        return s;
    }
}

