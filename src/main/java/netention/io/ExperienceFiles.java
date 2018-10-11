package netention.io;

import java.io.File;
import java.util.UUID;

/** watches a directory containing experience files for changes; updates internal Experience data */
public class ExperienceFiles {
    private final File root;

    //TODO

    public ExperienceFiles(File path, UUID me) {
        assert(path.isDirectory());
        this.root = path;
    }

}
