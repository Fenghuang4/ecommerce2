package Modules;

import java.util.Iterator;

public class Computer extends Product{

    String model, brand;
    Double cost;

    public Computer(String inModel, String inBrand, double inCost) {
        super(inModel, inBrand, inCost);
        this.cost = inCost;
        this.model = inModel;
        this.brand = inBrand;
    }

    public double getCost() {
        return this.cost;
    }

    public void printDetails() {

    }
}
