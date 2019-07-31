import cars.Engine;
import cars.Gearbox;
import cars.HybridCar;
import cars.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    HybridCar hybridCar;
    Engine engine;
    Gearbox gearbox;
    Tyre tyre;


    @Before
    public void setUp() {
        engine = new Engine(100,"hybrid");
        gearbox = new Gearbox("Automatic",6);
        tyre = new Tyre("Michelin", "E15", "Sport");
        hybridCar = new HybridCar(1000, "Toyota", "Prius", "Blue", gearbox, tyre, engine);
    }

    @Test
    public void hasPrice() {
        assertEquals(1000, hybridCar.getPrice());
    }

    @Test
    public void hasMake(){
        assertEquals("Toyota", hybridCar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Prius", hybridCar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", hybridCar.getColour());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, hybridCar.getTyre());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, hybridCar.getEngine());
    }

    @Test
    public void hasGearBox(){
        assertEquals(gearbox, hybridCar.getGearbox());
    }

    @Test
    public void hasType() {
        assertEquals("hybrid", hybridCar.getType());
    }

    @Test
    public void canFuel() {
        assertEquals("I have dirty dirty fossil fuels spawned in the North Sea by Mike", hybridCar.fuel());
    }


}
