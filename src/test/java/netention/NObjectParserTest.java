package netention;

import netention.match.Diff;
import netention.match.ValueDiff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NObjectParserTest {

    @Test
    void testParseFlat() {
        NObject n = NObject.parse(
                "'my computer'. \n Computer.  cpu: AMD64.  memory: '8gb'.  memory: '16gb'!"
        );
//        System.out.println(n);
        assertEquals(2, n.meta.size());
        assertEquals(2, n.belief.size());
        assertEquals(1, n.goal.size());

    }

    @Test void testParseWithInnerNObject() {
        NObject n = NObject.parse(
                "'my computer'. \n Computer.  cpu: { AMD64. mips: 1000. }.  memory: '8gb'.  memory: '16gb'!"
        );
        assertEquals(2, n.belief.size());
        assertEquals(1, n.goal.size());
    }
    @Test void testAndFold() {
        NObject n = NObject.parse(
                "x: y.  x: z."
        );
//        System.out.println(n);
        assertEquals(1, n.belief.size());
        assertEquals("[x: y,z.]", n.belief.values().toString());
    }


    @Test void testMatch() {
        NObject a = NObject.parse(
                "x: 1."
        );
        NObject b = NObject.parse(
                "x: 1."
        );

        NObject c = NObject.parse(
                "x: 2."
        );

        System.out.println(Diff.the(a, b));
        System.out.println(Diff.the(a, c));

        NObject d1 = NObject.parse(
                "x: >1."
        );
        NObject d2 = NObject.parse(
                "x: >1!"
        );
        NObject e = NObject.parse(
                "x: <1."
        );
        NObject f = NObject.parse(
                "x: <1!"
        );
    }
}
