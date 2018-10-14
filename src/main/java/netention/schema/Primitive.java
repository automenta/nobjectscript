package netention.schema;

import netention.NType;
import netention.Reality;
import netention.Schema;

/** primitive value types */
public class Primitive {
    public static void load(Schema s) {

        NType obj = s.type("Object");

        NType number = s.type("Number");
        NType integer = s.type("Integer");
        s.addEdge(s.inh, integer.id, number.id);

        NType text = s.type("Text");
    }
}
