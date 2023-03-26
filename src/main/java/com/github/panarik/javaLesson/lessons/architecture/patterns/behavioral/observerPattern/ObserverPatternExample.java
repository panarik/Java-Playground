package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.observerPattern;

/**
 * This class will grab stocks.
 */
public class ObserverPatternExample {

    public static void main(String[] args) {

        StockGrabber grabber = new StockGrabber();

        // Create first observer. It linked to existing grabber.
        Observer stockObserver1 = new StockObserver(grabber);

        // Each time if something happens in grabber, created and linked observers will be noticed about it.
        // Report after changed value.
        grabber.setIBMPrice(129.47);
        grabber.setApplePrice(164.92);
        grabber.setGooglePrice(116.63);


        //_____________________________________________
        // Create second observer. It linked to existing grabber.
        Observer stockObserver2 = new StockObserver(grabber);

        // Report from two existing observers after changed value in grabber.
        grabber.setIBMPrice(229.47);
        grabber.setApplePrice(264.92);
        grabber.setGooglePrice(216.63);


        //_______________________________________________
        // Delete one of the observers.
        grabber.unregister(stockObserver1);

        // Report from one existing observers after changed value in grabber.
        grabber.setIBMPrice(329.47);
        grabber.setApplePrice(364.92);
        grabber.setGooglePrice(316.63);

    }

}
