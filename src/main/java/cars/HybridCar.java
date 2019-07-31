package cars;

public class HybridCar extends Car {


    public HybridCar(int price, String make, String model, String colour, Gearbox gearbox, Tyre tyre, Engine engine) {
        super(price, make, model, colour, gearbox, tyre, engine);

        this.type = "hybrid";
    }

}
