import cars.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() {
        engine = new Engine(100, "Hybrid");
    }

    @Test
    public void hasPower() {
        assertEquals(100, engine.getPower());
    }


    @Test
    public void hasType() {
        assertEquals("Hybrid", engine.getType());
    }
}
