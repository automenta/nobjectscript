package netention;

import netention.io.NObjectParser;
import org.junit.jupiter.api.Test;

public class NObjectParserTest {

    @Test
    void testParse1() {
        NObject n = NObjectParser.parse(
                "'my computer'. \n Computer.  cpu: AMD64.  memory: '8gb'.  memory: '16gb'!"
        );
        System.out.println(n);
    }

    @Test void testParse2() {
        NObject n = NObjectParser.parse(
                "'my computer'. \n Computer.  cpu: { AMD64. mips: 1000. }.  memory: '8gb'.  memory: '16gb'!"
        );
        System.out.println(n);

    }
}
