package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new ConcretePublisher(new ArrayList<>());
        ConcreteObserverOne concreteObserverOne = new ConcreteObserverOne();
        ConcreteObserverTwo concreteObserverTwo = new ConcreteObserverTwo();
        publisher.attach(concreteObserverOne);
        publisher.attach(concreteObserverTwo);
        publisher.notifyObserver();

    }
}