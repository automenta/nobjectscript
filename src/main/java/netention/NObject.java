package netention;

import netention.io.NObjectParser;
import netention.parser.nobjectscriptLexer;
import netention.parser.nobjectscriptParser;
import netention.term.Statement;
import netention.term.Term;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class NObject extends Term {

    public final UUID id;
    final int hash;
    public final List<Statement> meta = new ArrayList();
    public final Map<Term, Statement> belief = new HashMap();
    public final Map<Term, Statement> goal = new HashMap();

    public NObject() {
        this(UUID.randomUUID()); //TODO maybe slow
    }

    public NObject(UUID id) {
        this.id = id;
        this.hash = id.hashCode();
    }

    public static NObject parse(String input) {
        return parse(CharStreams.fromString(input));
    }

    public static NObject parse(Path input) throws IOException {
        return parse(CharStreams.fromPath(input));
    }

    public static NObject parse(CharStream input) {
        nobjectscriptParser parser = new nobjectscriptParser(new CommonTokenStream(new nobjectscriptLexer(input)));

        NObjectParser pp = new NObjectParser();
        parser.addParseListener(pp);

        parser.nobject();

        if (!pp.termStack.isEmpty())
            throw new RuntimeException("termStack not clear: " + pp.termStack);
        if (!pp.nobjStack.isEmpty())
            throw new RuntimeException("nobjStack not clear: " + pp.nobjStack);

        return pp.nobj;
    }

    @Override
    public int hashCode() {
        return hash;
    }

    @Override
    public String toString() {
        return "{ /*" + id + "*/ " +
                meta.stream().map(m -> m.predicate.toString()).collect(Collectors.joining(",")) + ". " +
                belief.values().stream().map(Object::toString).collect(Collectors.joining(" ")) + " " +
                goal.values().stream().map(Object::toString).collect(Collectors.joining(" ")) +
                '}';
    }

    public int complexity() {
        return belief.size() + goal.size();
    }
}
