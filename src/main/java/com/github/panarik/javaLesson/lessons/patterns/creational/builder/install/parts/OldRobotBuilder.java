package com.github.panarik.javaLesson.lessons.patterns.creational.builder.install.parts;

import com.github.panarik.javaLesson.lessons.patterns.creational.builder.product.Robot;

/**
 * Build customized parts of robot from basic parts.
 */
public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot(); // Build empty robot.
    }


    public void buildRobotHead() {
        this.robot.setRobotHead("Old robot head");
        System.out.println("Making 'Old robot head'.");
    }

    public void buildRobotTorso() {
        this.robot.setRobotTorso("Old robot torso");
        System.out.println("Making 'Old robot torso'.");
    }

    public void buildRobotLegs() {
        this.robot.setRobotLegs("Old robot legs");
        System.out.println("Making 'Old robot legs'.");
    }

    public void buildRobotArms() {
        this.robot.setRobotArms("Old robot arms");
        System.out.println("Making 'Old robot arms'.");
    }

    public Robot getRobot() {
        return this.robot;
    }

}
