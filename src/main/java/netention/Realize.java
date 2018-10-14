package netention;

import netention.io.ExperienceFiles;

import java.io.*;
import java.nio.file.Path;
import java.util.logging.Logger;

/** main entry point
 *  reality data + supporting ontology/knowledgebase and index/cache interface */
public class Realize extends Reality {

    /** my local file-backed experience, watched for changes */
    private final ExperienceFiles myFiles;

    /** my experience */
    private final Experience me;
    private final Logger logger = Logger.getLogger(Realize.class.getSimpleName());

    public Realize(Path path) throws IOException {
        super();

        File cfgFile = path.resolve(".netention").toFile();
        ExperienceFiles.ExperienceFilesConfiguration cfg = null;
        if (cfgFile.exists()) {
            //TODO better config format
            try {
                ObjectInputStream s = new ObjectInputStream(new FileInputStream(cfgFile));
                cfg = (ExperienceFiles.ExperienceFilesConfiguration) s.readObject();
                s.close();
            } catch (Exception e) {
                cfg = null;
            }
        }
        if (cfg == null) {
            logger.info("new experience: " + path);

            cfg = ExperienceFiles.ExperienceFilesConfiguration.newDefault();

            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(cfgFile));
            s.writeObject(cfg);
            s.close();
        } else {
            logger.info("load experience " + cfg.id + " @ " + path);
        }


        this.myFiles = new ExperienceFiles(
                this.me = experience.computeIfAbsent(cfg.id, Experience::new)
                , path);

        //TODO connect to network locations, implied/specified by any which are found in the experience once loaded
        //if none found, suggest some as Notices
    }

}
