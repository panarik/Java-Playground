package com.github.panarik.javaLesson.lessons.patterns.behavior.observerPattern;

/**
 * This interface provides possibility creating, deleting and notify observers.
 */
public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();

}
