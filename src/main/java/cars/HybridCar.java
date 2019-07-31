package cars;

import cars.interfaces.IFuel;
import cars.interfaces.IStart;

public class HybridCar extends Car implements IFuel, IStart {


    public HybridCar(int price, String make, String model, String colour, Gearbox gearbox, Tyre tyre, Engine engine) {
        super(price, make, model, colour, gearbox, tyre, engine);

        this.type = "hybrid";
    }

    public String fuel() {
        return "I have dirty dirty fossil fuels spawned in the North Sea by Mike";
    }

    public String start() {
        return "Broom Broom!";
    }

}
