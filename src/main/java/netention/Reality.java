package netention;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/** 3rd person collection of subjective experiences */
public class Reality {

    final Map<UUID,Experience> experience = new ConcurrentHashMap<>();

}
