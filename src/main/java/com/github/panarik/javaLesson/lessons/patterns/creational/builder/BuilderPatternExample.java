package com.github.panarik.javaLesson.lessons.patterns.creational.builder;

import com.github.panarik.javaLesson.lessons.patterns.creational.builder.install.RobotEngineer;
import com.github.panarik.javaLesson.lessons.patterns.creational.builder.install.parts.OldRobotBuilder;
import com.github.panarik.javaLesson.lessons.patterns.creational.builder.install.parts.RobotBuilder;
import com.github.panarik.javaLesson.lessons.patterns.creational.builder.product.Robot;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the same construction code.
 */
public class BuilderPatternExample {

    public static void main(String[] args) {
        RobotBuilder builder = new OldRobotBuilder();
        RobotEngineer engineer = new RobotEngineer(builder);

        engineer.installRobot();
        Robot robot = engineer.getRobot();
    }

}
