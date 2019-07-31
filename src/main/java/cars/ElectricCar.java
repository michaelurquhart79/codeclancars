package cars;

public class ElectricCar extends Car{

    public ElectricCar(int price, String make, String model, String colour, Gearbox gearbox, Tyre tyre, Engine engine) {
        super(price, make, model, colour, gearbox, tyre, engine);

        this.type = "electric";
    }
}
