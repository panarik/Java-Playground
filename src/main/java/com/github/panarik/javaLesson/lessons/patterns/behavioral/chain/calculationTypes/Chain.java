package com.github.panarik.javaLesson.lessons.patterns.behavioral.chain.calculationTypes;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.chain.data.Numbers;

public interface Chain {

    /**
     * Setup all types of calculations.
     * Each type of calculations represented with one of implemented class by this method.
     * Complete chain of calculations become to scenario for passing {@link Numbers} through all types of calculations.
     *
     * @param nextChain new {@link Chain}
     */
    void setNextChain(Chain nextChain);

    /**
     * Execute one of types calculations.
     * {@link Numbers} knows exactly which type of calculations is needed.
     *
     * @param request Request with some {@link Numbers} for some calculations.
     */
    void execute(Numbers request);

}
