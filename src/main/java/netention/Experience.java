package netention;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/** 1st-person collection of nobjects */
public class Experience {

    /** who */
    public final UUID id;

    /** what */
    public final Map<UUID,NObject> obj = new ConcurrentHashMap<>();

    public Experience(UUID id) {
        this.id = id;
    }

}
