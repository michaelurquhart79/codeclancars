import cars.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    Gearbox gearbox;

    @Before
    public void setUp() {
        gearbox = new Gearbox("Automatic", 6);
    }

    @Test
    public void hasType() {
        assertEquals("Automatic", gearbox.getType());
    }

    @Test
    public void hasNumberOfGears(){
        assertEquals(6, gearbox.getNumberOfGears());
    }
}
