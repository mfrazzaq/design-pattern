package org.example;

import java.util.ArrayList;

public class ConcretePublisher extends  Publisher {
    private String state;
    public ConcretePublisher(ArrayList<IObserver> observers) {
        super(observers);
        this.state = "initial phases";
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
