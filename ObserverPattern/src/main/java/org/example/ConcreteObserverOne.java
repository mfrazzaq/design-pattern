package org.example;

public class ConcreteObserverOne implements IObserver {
    @Override
    public void update() {
        System.out.println("First observer is updated!");
    }
}
