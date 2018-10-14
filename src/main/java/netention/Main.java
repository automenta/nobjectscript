package netention;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String path;
        if (args.length == 0) {
             path = ".";
        } else {
            path = args[0];
        }
        new Realize(Paths.get(path).toAbsolutePath());
    }

}
