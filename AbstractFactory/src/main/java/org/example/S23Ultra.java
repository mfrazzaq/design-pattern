package org.example;

public class S23Ultra implements  IMobile{
    double price;

    public S23Ultra(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "S23 Ultra price is " + this.price;
    }
}
