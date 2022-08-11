package com.github.panarik.javaLesson.lessons.patterns.behavior.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

    List<Observer> observers; // Store all observers here.

    private double imbPrice; // current price for IBM.
    private double aaplPrice; // current price for Apple.
    private double googPrice; // current price for Google.

    StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        observers.remove(observerIndex);
        System.out.println("Observer with id-" + (observerIndex + 1) + " has been deleted.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(imbPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double ibmPrice) {
        this.imbPrice = ibmPrice;
        notifyObservers();
    }

    public void setApplePrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }

    public void setGooglePrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }

}
