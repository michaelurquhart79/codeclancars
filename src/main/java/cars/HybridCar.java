package cars;

public class HybridCar extends Car {

    private String type;

    public HybridCar(int price, String make, String model, String colour, Gearbox gearbox, Tyre tyre, Engine engine) {
        super(price, make, model, colour, gearbox, tyre, engine);

        this.type = "hybrid";
    }

    public String getType() {
        return type;
    }
}
