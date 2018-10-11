package netention;

import netention.io.ExperienceFiles;

import java.io.File;
import java.util.UUID;

/** main entry point
 *  reality data + supporting ontology/knowledgebase and index/cache interface */
public class Realize extends Reality {

    /** my local file-backed experience, watched for changes */
    private final ExperienceFiles myFiles;

    /** my experience */
    private final Experience me;

    public Realize(UUID me, File path) {
        super();
        this.me = experience.computeIfAbsent(me, Experience::new);
        this.myFiles = new ExperienceFiles(path, me);

        //TODO connect to network locations, implied/specified by any which are found in the experience once loaded
        //if none found, suggest some as Notices
    }

}
