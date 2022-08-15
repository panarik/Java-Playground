package com.github.panarik.javaLesson.lessons.patterns.structural.proxy;

/**
 * Defines safety operating ATM using proxy method.
 * Another reason it's performance reason. Get one system into multiple regions.
 */
public class ProxyPatternExample {

    public static void main(String[] args) {

        GetATMData proxyATM = new ATMProxy();

        // User can gat data from proxy ATB if real ATM is busy.
        System.out.println(proxyATM.getATMData());

    }

}
