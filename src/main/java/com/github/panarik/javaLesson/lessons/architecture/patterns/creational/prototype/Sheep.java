package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep has created.");
    }

    /**
     * Making copy of existing object.
     * @return new copy {@link Animal}
     */
    public Animal makeCopy() {
        Sheep sheepClone;
        try {
            sheepClone = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return sheepClone;
    }

}
