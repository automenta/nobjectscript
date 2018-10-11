package netention;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/** knowledgebase: collection of nobjects and supporting knowledge/ontologies */
public class Experience {

    public final Map<UUID,NObject> obj = new ConcurrentHashMap<>();

    /** alias map */
    public final Map<Atom,?> alias = new ConcurrentHashMap<>();

}
