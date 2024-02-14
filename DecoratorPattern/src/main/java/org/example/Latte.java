package org.example;

public class Latte implements  ICoffee{
    private final double cost;
    public Latte(double cost){
        this.cost = cost;
    }
    @Override
    public String desc() {
        return "This is Coffee Latte";
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
