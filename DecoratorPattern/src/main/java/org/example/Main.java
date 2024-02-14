package org.example;

public class Main {
    public static void main(String[] args) {
        CareemDecorator order1 = new CareemDecorator(new Latte(10));
        MilkDecorator order2 = new MilkDecorator((new Espresso(12)));
        System.out.println("First order:");
        System.out.println(order1.desc());
        System.out.println(order1.cost());
        System.out.println("Second order:");
        System.out.println(order2.desc());
        System.out.println(order2.cost());
    }
}