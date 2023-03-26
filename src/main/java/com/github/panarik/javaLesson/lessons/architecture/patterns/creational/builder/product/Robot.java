package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.builder.product;

/**
 * Basic robot parts.
 */
public class Robot implements RobotPlan {

    private String head;
    private String torso;
    private String legs;
    private String arms;

    public void setRobotHead(String head) {
        this.head = head;
    }

    public String getHead() {
        return head;
    }

    public void setRobotTorso(String torso) {
        this.torso = torso;
    }

    public String getTorso() {
        return torso;
    }

    public void setRobotLegs(String legs) {
        this.legs = legs;
    }

    public String getLegs() {
        return legs;
    }

    public void setRobotArms(String arms) {
        this.arms = arms;
    }

    public String getArms() {
        return arms;
    }

}
