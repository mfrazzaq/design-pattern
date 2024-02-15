package org.example;

public class ConcreteObserverTwo implements IObserver {
    @Override
    public void update() {
        System.out.println("Concrete Observer two is updated");
    }
}
