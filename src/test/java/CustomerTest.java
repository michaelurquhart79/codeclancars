import dealership.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("Mike", 10000);
    }

    @Test
    public void hasName(){
        assertEquals("Mike", customer.getName());
    }

    @Test
    public void hasWallet(){
        assertEquals(10000, customer.getWallet());
    }
}
