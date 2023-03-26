package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.chain;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.chain.calculationTypes.AddNumbers;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.chain.calculationTypes.MultipleNumbers;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.chain.calculationTypes.SubtractNumbers;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.chain.data.Numbers;

public class ChainPatternExample {

    public static void main(String[] args) {

        //Create chain objects.
        AddNumbers firstChain = new AddNumbers();
        MultipleNumbers secondChain = new MultipleNumbers();
        SubtractNumbers thirdChain = new SubtractNumbers();

        // Set up chain scenario.
        firstChain.setNextChain(secondChain);
        secondChain.setNextChain(thirdChain);

        // Create Numbers.
        Numbers addCalc = new Numbers("add", 6, 2);
        Numbers multipleCalc = new Numbers("multiple", 6, 2);
        Numbers subtractCalc = new Numbers("subtract", 6, 2);
        Numbers errorCalc = new Numbers("other", 6, 2);

        // Execute calculations.
        firstChain.execute(addCalc);
        firstChain.execute(multipleCalc);
        firstChain.execute(subtractCalc);
        firstChain.execute(errorCalc);
    }



}
