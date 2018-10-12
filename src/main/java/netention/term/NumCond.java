package netention.term;

import netention.match.ValueDiff;

/** numeric condition; an expression which might match a concrete numeric value */
abstract public class NumCond extends Term implements Condition {

    abstract public static class IntCond extends NumCond {

        abstract protected ValueDiff diff(int i);

        @Override
        public ValueDiff diff(Term x) {
            if (x instanceof IntCond) {
                return equals(x) ?
                        ValueDiff.EQUAL :
                        ValueDiff.UNKNOWN; //TODO this can be more detailed in some cases
            } else if (x instanceof Num.Int) {
                return diff(((Num.Int)x).value);
            } else {
                return ValueDiff.UNKNOWN;
            }
        }

        public static class UnaryIntCond extends IntCond {

            public UnaryIntCond(Op op, int c) {
                this.op = op;
                this.c = c;
            }

            @Override
            public String toString() {
                return op.label() + c;
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;

                if (obj instanceof UnaryIntCond) {
                    UnaryIntCond u = ((UnaryIntCond)obj);
                    return u.c == c && u.op == op;
                }

                return false;
            }

            public enum Op {
              GT {
                  @Override
                  public String label() {
                      return ">";
                  }
                  @Override
                  public boolean includes(int c, int v) {
                      return v > c;
                  }
              }, GTE{
                    @Override
                    public String label() {
                        return ">=";
                    }

                    @Override
                    public boolean includes(int c, int v) {
                        return v >= c;
                    }
                }, LT{
                    @Override
                    public String label() {
                        return "<";
                    }
                    @Override
                    public boolean includes(int c, int v) {
                        return v < c;
                    }
                }, LTE{
                    @Override
                    public String label() {
                        return "<=";
                    }
                    @Override
                    public boolean includes(int c, int v) {
                        return v <= c;
                    }
                }, EQ{
                    @Override
                    public String label() {
                        return "=";
                    }
                    @Override
                    public boolean includes(int c, int v) {
                        return v == c;
                    }
                }
                //, NEQ //should negation be handled by general NEG operator??
                ;

              /** c = condition parameter, v = value to be tested */
              abstract public boolean includes(int c, int v);

              public String label() {
                  return name();
              }
            };

            final Op op;

            /** operator parameter */
            final int c;

            @Override
            protected ValueDiff diff(int i) {
                int delta = op.includes(c, i) ? 0 : Math.abs(c - i);
                String msg = c + " " + op.name() + " " + i;
                return ValueDiff.the(delta, msg);
            }
        }
    }
}
