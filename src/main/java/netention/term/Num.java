package netention.term;

import netention.match.ValueDiff;

/** scalar value */
abstract public class Num extends Term {

    @Override
    public ValueDiff diff(Term x) {
        if (x instanceof Num) {
            return ValueDiff.the(Math.abs(number().floatValue() - ((Num)x).number().floatValue()));
        } else {
            return ValueDiff.UNKNOWN;
        }
    }

    abstract public Number number();

//    /** wraps a Double value */
//    private static class Dbl extends Num {
//
//    }

    /** wraps a Integer value */
    public static class Int extends Num  {
        public final int value;

        public Int(int i) {
            this.value = i;
        }

        @Override
        public int hashCode() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Int && value == ((Int)obj).value;
        }


        @Override public Number number() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
