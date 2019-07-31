import dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setUp() {
        till = new Till(1000);
    }

    @Test
    public void hasMoney(){
        assertEquals(1000, till.getMoney());
    }

    @Test
    public void canAddMoney(){
        till.addMoney(1500);
        assertEquals(2500, till.getMoney());
    }
}
