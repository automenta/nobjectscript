package netention.term;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** boolean conjunction
 *  TODO extend to Commutive (compound)
 * */
public class And extends Term {
    public final Term[] sub;

    public static Term the(Term... condition) {
        switch (condition.length) {
            case 0:
                throw new RuntimeException("null And");
            case 1:
                return condition[0];
            default: {
                Set<Term> s = new TreeSet();
                for (Term c : condition) {
                    if (c instanceof And) {
                        for (Term d : ((And)c).sub)
                            s.add(d);
                    } else {
                        s.add(c);
                    }
                }
                if (s.size() == 1)
                    return condition[0];
                else {
                    return new And(s.toArray(Term.empty_term_aray));
                }
            }

        }
    }

    private And(Term[] sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return Stream.of(sub).map(Object::toString).collect(Collectors.joining(","));
    }
}
