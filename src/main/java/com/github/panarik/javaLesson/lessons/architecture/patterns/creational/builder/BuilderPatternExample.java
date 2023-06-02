package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.install.RobotEngineer;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.install.parts.OldRobotBuilder;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.install.parts.RobotBuilder;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.product.Robot;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the same construction code.
 */
public class BuilderPatternExample {

    public static void main(String[] args) {
        RobotEngineer engineer = new RobotEngineer(new OldRobotBuilder());

        engineer.installRobot();
        Robot robot = engineer.getRobot();
    }

}
