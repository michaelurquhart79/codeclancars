package cars;

public abstract class Car {
    private int price;
    private String make;
    private String model;
//    private String engineType;
    private String colour;
    private Gearbox gearbox;
    private Tyre tyre;
    private Engine engine;
    protected String type;

    public Car(int price,
               String make,
               String model,
               String colour,
               Gearbox gearbox,
               Tyre tyre,
               Engine engine) {
        this.price = price;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.gearbox = gearbox;
        this.tyre = tyre;
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getType() {
        return type;
    }
}
