package cars;

import cars.interfaces.ICharge;
import cars.interfaces.IFuel;
import cars.interfaces.IStart;

public class ElectricCar extends Car implements ICharge, IStart {

    public ElectricCar(int price, String make, String model, String colour, Gearbox gearbox, Tyre tyre, Engine engine) {
        super(price, make, model, colour, gearbox, tyre, engine);

        this.type = "electric";
    }

    public String charge() {
        return "I am charged";
    }

    public String start() {
        return "ZZZZZZZZZ you cant hear me coming!";
    }
}
