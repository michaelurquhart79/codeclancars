import cars.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void setUp() {
        tyre = new Tyre("Michelin", "XYZ-100", "budget");
    }

    @Test
    public void tyreHasMake() {
        assertEquals("Michelin", tyre.getMake());
    }

    @Test
    public void tyreHasModel () {
        assertEquals("XYZ-100", tyre.getModel());
    }
    
    @Test
    public void tyreHasType () {
        assertEquals("budget", tyre.getType());
    }
}
