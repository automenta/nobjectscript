package netention.io;

import netention.Experience;
import netention.util.FSWatch;
import org.antlr.v4.runtime.misc.Pair;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.logging.Logger;

/** watches a directory containing experience files for changes; updates internal Experience data */
public class ExperienceFiles implements Consumer<Pair<Path, WatchEvent.Kind>> {

    private final Path root;
    private final FSWatch watch;

    /** the experience updated by this instance */
    private final Experience exp;

    private static final Logger logger = Logger.getLogger(ExperienceFiles.class.getSimpleName());


    public ExperienceFiles(Experience e, Path path) throws IOException {
        assert(path.toFile().isDirectory());
        this.exp = e;
        this.root = path;
        this.watch = new FSWatch(path, this);
    }

    @Override
    public void accept(Pair<Path, WatchEvent.Kind> pathKindPair) {
        /*
            public static final Kind<Path> ENTRY_CREATE = new StandardWatchEventKinds.StdWatchEventKind("ENTRY_CREATE", Path.class);
            public static final Kind<Path> ENTRY_DELETE = new StandardWatchEventKinds.StdWatchEventKind("ENTRY_DELETE", Path.class);
            public static final Kind<Path> ENTRY_MODIFY = new StandardWatchEventKinds.StdWatchEventKind("ENTRY_MODIFY", Path.class);
                public static final Kind<Object> OVERFLOW = new StandardWatchEventKinds.StdWatchEventKind("OVERFLOW", Object.class);
         */
        WatchEvent.Kind kind = pathKindPair.b;
        if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
            logger.info("add " + pathKindPair.a);
        } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
            logger.info("chg " + pathKindPair.a);
        } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
            logger.info("rem " + pathKindPair.a);
        }
    }

}
