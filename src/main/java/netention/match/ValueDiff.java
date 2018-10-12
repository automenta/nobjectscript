package netention.match;

public class ValueDiff {
    /** distance heuristic; 0=equal, >0 = some difference */
    public final float dist;
    /* @Nullable */ public final String msg;

    public static final ValueDiff EQUAL = new ValueDiff(0, null) {
        @Override
        public String toString() {
            return "equal";
        }
    };

    public static final ValueDiff UNKNOWN = new ValueDiff(Float.NaN, null) {
        @Override
        public String toString() {
            return "?";
        }
    };

    public static ValueDiff the(float dist) {
        return the(dist, null);
    }
    public static ValueDiff the(float dist, String msg) {
        if (msg == null) {
            if (dist == 0)
                return ValueDiff.EQUAL;
            if (dist != dist)
                return ValueDiff.UNKNOWN;
        }

        return new ValueDiff(dist, msg);
    }

    private ValueDiff(float dist, String msg) {
        this.dist = dist;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg!=null ? (dist + ":" + msg) : String.valueOf(dist);
    }
}
