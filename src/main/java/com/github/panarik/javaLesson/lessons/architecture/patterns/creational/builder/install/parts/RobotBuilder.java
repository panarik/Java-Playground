package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.install.parts;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.product.Robot;

/**
 * This interface provides building different types of Robots from basic Robot parts.
 */
public interface RobotBuilder {

    void buildRobotHead();

    void buildRobotTorso();

    void buildRobotLegs();

    void buildRobotArms();

    /**
     * Returns robot parts after creation.
     *
     * @return {@link Robot}
     */
    Robot getRobot();

}
