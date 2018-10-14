package netention;

import netention.io.NObjectParser;
import netention.term.Statement;
import netention.term.Term;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

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
        return new NObjectParser(new NObject()).nobject(input);
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
