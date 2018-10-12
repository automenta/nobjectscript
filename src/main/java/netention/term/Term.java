package netention.term;

import netention.match.ValueDiff;

abstract public class Term implements Comparable {
    public static final Term[] empty_term_aray = new Term[0];

    @Override
    public int compareTo(Object o) {
        return this == o ? 0 : toString().compareTo(o.toString()); //TODO more efficient, general
    }

    /** default impl */
    public ValueDiff diff(Term x) {
        if (equals(x))
            return ValueDiff.EQUAL;
        else
            return ValueDiff.UNKNOWN;
    }
}
