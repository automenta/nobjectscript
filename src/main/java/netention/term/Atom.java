package netention.term;

public class Atom extends Term {

    public final String id;

    public Atom(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Atom && id.equals(((Atom)obj).id);
    }
}
