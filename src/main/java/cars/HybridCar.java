package cars;

import cars.interfaces.IFuel;

public class HybridCar extends Car implements IFuel {


    public HybridCar(int price, String make, String model, String colour, Gearbox gearbox, Tyre tyre, Engine engine) {
        super(price, make, model, colour, gearbox, tyre, engine);

        this.type = "hybrid";
    }

    public String fuel() {
        return "I have dirty dirty fossil fuels spawned in the North Sea by Mike";
    }

}
