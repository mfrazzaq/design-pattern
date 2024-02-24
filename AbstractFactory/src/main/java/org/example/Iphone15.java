package org.example;

public class Iphone15 implements IMobile{
    double price;

    public Iphone15(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Iphone15 price is " + this.price;
    }
}
