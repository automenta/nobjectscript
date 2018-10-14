package netention.schema;

import netention.Schema;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchemaTest {

    static final Schema s = Schema.newDefault();

    @Test
    void test1() {
        {
            Schema.Lookup x = s.types("width");
            x.print();
        }

        {
            Schema.Lookup y = s.types("wwidth");
            assertEquals("width", y.items.top().string);

        }
    }

}
