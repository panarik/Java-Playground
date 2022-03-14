package com.github.panarik.javaLesson.work.season1.work6.items;

public class Cup extends AbstractBowl {


    @Override
    public void putInto(int foodAmount) {
        super.putInto(foodAmount);
        System.out.printf("В кружку положили %d еды. Теперь в ней %d еды\n", foodAmount, this.amount);
    }



    @Override
    public int getAmount() {
        return super.getAmount();
    }
}
