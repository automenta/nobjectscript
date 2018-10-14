package netention;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParseNObjectTest {

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


}
