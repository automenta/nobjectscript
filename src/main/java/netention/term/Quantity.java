package netention.term;

/** scalar quantity, typed with a measurement unit
 * TODO integrate with UOM library
 * */
public class Quantity extends Term {
    public final String unit;
    public final Num value;

    public Quantity(String unit, Num value) {
        this.unit = unit;
        this.value = value;
    }
}
