package netention.term;

import netention.NObject;
import netention.io.NObjectParser;
import netention.match.ValueDiff;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.nio.file.Path;

abstract public class Term implements Comparable {
    public static final Term[] empty_term_aray = new Term[0];

    public static Term parse(String input) {
        return parse(CharStreams.fromString(input.trim()));
    }

    private static Term parse(CharStream input) {
        return new NObjectParser().term(input);
    }

    /** probably better to override */
    @Override
    public int compareTo(Object o) {
        return this == o ? 0 : toString().compareTo(o.toString());
    }

    /** probably better to override */
    @Override
    public boolean equals(Object obj) {
        return this == obj || (getClass() == obj.getClass() && this.toString().equals(obj.toString()));
    }

    /** probably better to override */
    @Override public int hashCode() {
        return toString().hashCode();
    }

    /** default impl */
    public ValueDiff diff(Term x) {
        if (equals(x))
            return ValueDiff.EQUAL;
        else
            return ValueDiff.UNKNOWN;
    }
}
