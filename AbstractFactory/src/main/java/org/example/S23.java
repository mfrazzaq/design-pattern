package org.example;

public class S23 implements  IMobile{
    double price;

    public S23(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "S23 price is " + this.price;
    }
}
