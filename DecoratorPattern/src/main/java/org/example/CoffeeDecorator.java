package org.example;

public class CoffeeDecorator implements  ICoffee{
    protected ICoffee coffee;
    public CoffeeDecorator(ICoffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String desc() {
        return this.coffee.desc();
    }

    @Override
    public double cost() {
        return this.coffee.cost();
    }
}
