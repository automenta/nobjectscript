package netention;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class NObject extends Term {

    public final UUID id;
    final int hash;
    public final List<Statement> meta = new ArrayList();
    public final List<Statement> stmt = new ArrayList();

    public NObject() {
        this(UUID.randomUUID()); //TODO maybe slow
    }

    public NObject(UUID id) {
        this.id = id;
        this.hash = id.hashCode();
    }

    @Override
    public int hashCode() {
        return hash;
    }

    @Override
    public String toString() {
        return "{ /*" + id + "*/ " +
                meta.stream().map(m -> m.predicate.toString()).collect(Collectors.joining(",")) + ". " +
               stmt.stream().map(Object::toString).collect(Collectors.joining(" ")) + '}';
    }
}
