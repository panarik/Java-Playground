package com.github.panarik.javaLesson.lessons.patterns.creational.builder.product;

/**
 * Interface provides Robot structure for building any robots.
 */
public interface RobotPlan {

    void setRobotHead(String head);

    void setRobotTorso(String torso);

    void setRobotLegs(String legs);

    void setRobotArms(String arms);

}
