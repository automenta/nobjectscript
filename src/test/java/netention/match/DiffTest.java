package netention.match;

import netention.NObject;
import org.junit.jupiter.api.Test;

class DiffTest {

    @Test
    void testDiff1() {
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
//
//        NObject d1 = NObject.parse(
//                "x: >1."
//        );
//        NObject d2 = NObject.parse(
//                "x: >1!"
//        );
//        NObject e = NObject.parse(
//                "x: <1."
//        );
//        NObject f = NObject.parse(
//                "x: <1!"
//        );
    }

}