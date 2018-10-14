package netention;

import java.util.LinkedHashSet;
import java.util.Set;

/** schema type */
public class NType {

    public final String id;

//    /** one or more usable identifiers */
//    final String[] aliases;


//    /** subtype cache */
//    transient final Set<NType> subType = new LinkedHashSet();

    //String comment;

    public NType(String id) {
        this.id = id;
    }
}
