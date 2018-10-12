package netention.match;

import netention.NObject;
import netention.term.Statement;
import netention.term.Term;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/** semantic difference evaluation between a pair of NObjects */
public class Diff {

    private final NObject x, y;

    final Map<Term, StatementDiff> diff = new HashMap();

    private final static Comparator<NObject> diffOrder = Comparator
            .comparingInt(NObject::complexity)
            .thenComparingLong((NObject z) -> z.id.getMostSignificantBits())
            .thenComparingLong((NObject z) -> z.id.getLeastSignificantBits())
            ;

    public static Diff the(NObject x, NObject y) {
        assert(x!=y);
        if ( diffOrder.compare(x, y) >= 0)
            return new Diff(x, y);
        else
            return new Diff(y, x);
    }

    /** x should be the 'smaller' of the two */
    private Diff(NObject x, NObject y) {
        this.x = x;
        this.y = y;
        //modes TODO make optional
        // x.belf <-> y.belf?
        beliefToBelief();
        // x.belf --> y.goal?
        // y.belf --> x.goal?
        // x.goal <-> y.goal?


    }

    private void beliefToBelief() {
        if (x.belief.isEmpty() || y.belief.isEmpty())
            return;
        for (Map.Entry<Term, Statement> xxx : x.belief.entrySet()) {
            Statement yy = y.belief.get(xxx.getKey());
            if (yy!=null) {
                diff(yy.subject, xxx.getValue().predicate, yy.predicate);
            }
        }
    }

    /**
     * @param subject common subject
     * @param x predicate from x's statement
     * @param y predicate from y's statement
     */
    private void diff(Term subject, Term x, Term y) {
        diff.put(subject, new StatementDiff(subject, x, y, x.diff(y)));
    }

    @Override
    public String toString() {
        return x + "<->" + y + ": " + diff.values();
    }
}
