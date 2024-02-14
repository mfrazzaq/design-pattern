package org.example;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String desc() {
        return super.desc() + " with milk";
    }

    @Override
    public double cost() {
        return super.cost() + 2;
    }
}
