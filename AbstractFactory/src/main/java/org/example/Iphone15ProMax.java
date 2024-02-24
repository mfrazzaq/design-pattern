package org.example;

public class Iphone15ProMax implements IMobile{
    double price;

    public Iphone15ProMax(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Iphone 15 pro max price is: " + this.price;
    }
}
