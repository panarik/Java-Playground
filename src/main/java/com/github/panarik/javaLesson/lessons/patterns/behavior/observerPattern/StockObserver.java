package com.github.panarik.javaLesson.lessons.patterns.behavior.observerPattern;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIdTracker = 0; // Count created observers.
    private int observerId;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New observer has been created with id: " + this.observerId);
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printThePrices(); // Each observer print prices.
    }

    private void printThePrices() {
        System.out.println("Observer with Id-" + observerId + " report: \n" +
                "IBM price - " + ibmPrice + ",\n" +
                "Apple price - " + aaplPrice + ",\n" +
                "Google price - " + googPrice + ".\n");
    }

}
