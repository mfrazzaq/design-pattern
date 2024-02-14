package org.example;

public class Espresso implements  ICoffee{
    private final double cost;
    public Espresso(double cost){
        this.cost = cost;
    }
    @Override
    public String desc() {
        return "This is an Espresso Coffe";
    }

    @Override
    public double cost() {
        return cost;
    }
}
