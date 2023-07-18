package Modules;

public abstract class Product {

    private String IDNumber;
    private String name;
    private double cost;

    public Product(String inID, String inName, double inCost) {
        this.IDNumber = inID;
        this.name = inName;
        this.cost = inCost;
    }

    public abstract double getCost();

    public abstract void printDetails();
}
