package cars;

public class Gearbox {
    private String type;
    private int numberOfGears;

    public Gearbox(String type, int numberOfGears) {
        this.type = type;
        this.numberOfGears = numberOfGears;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }
}
