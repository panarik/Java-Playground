package com.github.panarik.javaLesson.lessons.patterns.creational.prototype;

/**
 * Making copy of something.
 */
public interface Animal extends Cloneable {

    Animal makeCopy();

}
