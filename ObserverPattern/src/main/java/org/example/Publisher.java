package org.example;

import java.util.ArrayList;

public abstract class Publisher {
    private final ArrayList<IObserver> observers;
    public Publisher(ArrayList<IObserver> observers){
        this.observers = observers;
    }
    public void notifyObserver() {
        this.observers.forEach(IObserver::update);
    }

    public void attach(IObserver observer){
        this.observers.add(observer);
    }
    public void detach(IObserver observer) {
        this.observers.remove(observer);
    }

}
