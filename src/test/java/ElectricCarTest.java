import cars.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ElectricCarTest {
    ElectricCar electricCar;
    Engine engine;
    Gearbox gearbox;
    Tyre tyre;


    @Before
    public void setUp() {
        engine = new Engine(100,"electric");
        gearbox = new Gearbox("Automatic",6);
        tyre = new Tyre("Michelin", "E15", "Sport");
        electricCar = new ElectricCar(5000, "Toyota", "Zippo", "Blue", gearbox, tyre, engine);
    }

    @Test
    public void hasPrice() {
        assertEquals(5000, electricCar.getPrice());
    }

    @Test
    public void hasMake(){
        assertEquals("Toyota", electricCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Zippo", electricCar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", electricCar.getColour());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, electricCar.getTyre());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, electricCar.getEngine());
    }

    @Test
    public void canCharge() {
        assertEquals("I am charged", electricCar.charge());
    }

    @Test
    public void hasGearBox(){
        assertEquals(gearbox, electricCar.getGearbox());
    }

    @Test
    public void hasType() {
        assertEquals("electric", electricCar.getType());
    }


}
