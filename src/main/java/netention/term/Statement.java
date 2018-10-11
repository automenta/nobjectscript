package netention.term;

abstract public class Statement {

    public final Term subject, predicate;

    private Statement(Term subject, Term predicate) {
        assert(!subject.equals(predicate));
        this.subject = subject;
        this.predicate = predicate;
    }

    public static Statement the(Term subj, Term pred, byte punc) {
        switch (punc) {
            case '.':
                return new Belief(subj, pred);
            case '!':
                return new Goal(subj,pred);
        }
        throw new UnsupportedOperationException();
    }

    public abstract byte punc();

    @Override
    public final String toString() {
        return subject + ": " + predicate + (char) punc();
    }

    public static class Belief extends Statement {

        protected Belief(Term subject, Term predicate) {
            super(subject, predicate);
        }

        @Override
        public byte punc() {
            return '.';
        }
    }

    public static class Goal extends Statement {

        protected Goal(Term subject, Term predicate) {
            super(subject, predicate);
        }

        @Override
        public byte punc() {
            return '!';
        }

    }
}
