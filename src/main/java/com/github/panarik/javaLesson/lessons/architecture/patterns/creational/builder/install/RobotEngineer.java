package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.install;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.product.Robot;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.install.parts.RobotBuilder;

/**
 * This RobotEngineer installs any robots from prepared custom parts.
 * RobotEngineer gets RobotBuilder and install all custom prepared Robot parts from it.
 */
public class RobotEngineer {

    private RobotBuilder builder; //This builder makes parts from basic schemes.

    // Needs RobotBuilder for getting custom prepared Robot parts.
    public RobotEngineer(RobotBuilder builder) {
        this.builder = builder;
    }

    /**
     * Install all prepared Robot parts.
     */
    public void installRobot() {
        this.builder.buildRobotHead();
        this.builder.buildRobotTorso();
        this.builder.buildRobotLegs();
        this.builder.buildRobotArms();
        System.out.println("Installed all Robot parts.");
    }

    /**
     * Delivering new installed Robot.
     */
    public Robot getRobot() {
        System.out.println("New Robot ready to delivering.");
        return this.builder.getRobot();
    }

}
