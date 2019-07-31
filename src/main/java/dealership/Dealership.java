package dealership;

import cars.Car;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private ArrayList<Car> carStock;
    private Till till;
    private Dealer dealer;
    private Customer customer;

    public Dealership(String name, ArrayList<Car> carStock, Till till, Dealer dealer, Customer customer) {
        this.name = name;
        this.carStock = carStock;
        this.till = till;
        this.dealer = dealer;
        this.customer = customer;
    }

    public void removeCar(Car car){
        carStock.remove(car);
    }

    public void addToTill(int cash){
        this.till.addMoney(cash);
    }
}
