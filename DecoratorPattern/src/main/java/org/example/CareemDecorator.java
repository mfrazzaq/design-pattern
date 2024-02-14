package org.example;

public class CareemDecorator extends  CoffeeDecorator{
    public CareemDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String desc() {
        return super.desc() + " with careem";
    }

    @Override
    public double cost() {
        return super.cost() + 2;
    }
}
