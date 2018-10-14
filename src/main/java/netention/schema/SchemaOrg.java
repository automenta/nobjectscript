package netention.schema;

import netention.NType;
import netention.Schema;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.CsvFormat;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.CsvParser;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.CsvParserSettings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Schema.org and ActivityStreams Ontology import
 *
 * @author me
 */
abstract public class SchemaOrg {

    /** type filter and remapper */
    static protected String type(String id) {
        id = id.substring(18); //remove 'http://schema.org/'
        switch (id) {
            case "Thing":
                return "Object";
            default:
                return id;
        }
    }

    public static void load(Schema s) {

        new SchemaOrg() {



            @Override
            public void onClass(String id, String label, List<String> supertypes, String comment) {
                if (id.equals("http://schema.org/Thing"))
                    return;

                id = type(id);


                NType t = s.type(id);
                //t.setComment(comment);
                s.byID.put(id, t);
                s.byAlias.put(id, t);
                for (String supertype : supertypes) {
                    s.addEdge(s.inh, id, type(supertype));
                }

                //System.out.println(id + " " + label + " " + supertypes + " " + comment);
                //id = escape(id);

//                    MutableNObject t = new MutableNObject(id, label);
//                    t.description(comment);
//                    t.put(">", supertypes.toArray(new String[supertypes.size()]));
//
//
//                    pending.add(t);


//                    types.addNode(id);
//                    for (String s : supertypes) {
//                        if (!s.isEmpty())
//                            types.putEdge(escape(s), id);
//                    }


            }

//            private String escape(String id) {
//                return id.replace('-', '_');
//            }

            @Override
            public void onProperty(String id, String label, List<String> domains, List<String> ranges, String comment) {
                //System.out.println(id + " " + label + " " + domains + " " + ranges + " " + comment);

                id = type(id);
                NType t = s.type(id);

                for (String d : domains) {
                    s.addEdge(s.ext, type(d), id);
                }
                for (String r : ranges) {
                    s.addEdge(s.inh, id, type(r));
                }

//                    NObject t = new NObject(id, label);
//                    t.description(comment);
//
//                    db.put(t);

                    /*for (String s : domains) {
                        db.edgeAdd(id, SpimeDB.OpEdge.extinh, s);
                    }
                    for (String s : ranges) {
                        db.edgeAdd(s, SpimeDB.OpEdge.extinh, id);
                    }*/

            }


        };
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        db.add(pending);


//        MutableGraph<String> copy = Graphs.copyOf(types);
//
//
//        //topological sort
//        while (!copy.nodes().isEmpty()) {
//            //find roots
//            for (String r : Lists.newArrayList(copy.nodes())) {
//                if (copy.inDegree(r) == 0) {
//                    copy.removeNode(r);
//
//                    Set<String> superClasses = types.predecessors(r);
//                    Class<? extends NObject> rc = db.the(r, superClasses.toArray(new String[superClasses.size()]));
//                    //System.out.println(r + "\t" + rc + ":\t" + getSuperInterfacesOf(rc) );
//
//
//                }
//
//            }
//
//            //NObject t = db.newTag(id, supertypes.toArray(new String[supertypes.size()]));
//
//        }
//
//        logger.info("{} classes created ({} inheritances)", types.nodes().size(), types.edges().size());
    }


    public SchemaOrg() {


        CsvParserSettings settings = new CsvParserSettings();
        ((CsvFormat) settings.getFormat()).setLineSeparator("\r\n");
        settings.setQuoteDetectionEnabled(true);
        settings.setSkipEmptyLines(true);
        settings.setMaxCharsPerColumn(16 * 1024);

        CsvParser reader = new CsvParser(settings);


        int c = 0;
        String[] line;

        reader.beginParsing(SchemaOrg.class.getClassLoader().getResourceAsStream("schemaorg/all-layers-types.csv"));
        /*
        0 = "id"
        1 = "label"
        2 = "comment"
        3 = "subTypeOf"
        4 = "enumerationtype"
        5 = "equivalentClass"
        6 = "properties"
        7 = "subTypes"
        8 = "supersedes"
        9 = "supersededBy"
        10 = "isPartOf"
        */
        while ((line = reader.parseNext()) != null) {
            if (c++ == 0) /* skip first line */
                continue;
            String id = line[0];
            String label = line[1];
            String comment = line[2];

            List<String> supertypes =
                    line[3] != null ? Stream.of(line[3].split(" ")).filter(x -> x != null && !x.isEmpty()).collect(Collectors.toList())
                            :
                            List.of();

            onClass(id, label, supertypes, comment);
        }
        reader.stopParsing();

        reader.beginParsing(SchemaOrg.class.getClassLoader().getResourceAsStream("schemaorg/all-layers-properties.csv"));
        /*
        0 = "id"
        1 = "label"
        2 = "comment"
        3 = "subPropertyOf"
        4 = "equivalentProperty"
        5 = "subproperties"
        6 = "domainIncludes"
        7 = "rangeIncludes"
        8 = "inverseOf"
        9 = "supersedes"
        10 = "supersededBy"
        11 = "isPartOf"
         */
        c = 0;
        while ((line = reader.parseNext()) != null) {
            if (c++ == 0) /* skip first line */
                continue;

            String id = line[0];
            String label = line[1];
            String comment = line[2];
            String domainStr = line[6];
            String rangeStr = line[7];
            List<String> domains = domainStr!=null ? List.of(domainStr.split(" ")) : List.of();
            List<String> ranges = rangeStr!=null ? List.of(rangeStr.split(" ")) : List.of();

            onProperty(id, label, domains, ranges, comment);
        }
        reader.stopParsing();

    }

    abstract public void onClass(String id, String label, List<String> supertypes, String comment);

    abstract public void onProperty(String id, String label, List<String> domains, List<String> ranges, String comment);

}
