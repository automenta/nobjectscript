package netention.match;

import netention.term.Term;

public class StatementDiff {

    public final Term subj, x, y;
    public final ValueDiff value;


    public StatementDiff(Term subject, Term x, Term y, ValueDiff value) {
        this.value = value;
        this.x = x;
        this.y = y;
        this.subj = subject;
    }
    @Override
    public String toString() {
        return x + " <-> " + y  + "? " + value.toString();
    }
}
