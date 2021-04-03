package com.github.panarik.javaLesson.work6.items;

public class Bowl {

    private int foodAmount; //количество  еды

    //кладём еду в миску
    public void putFoodInto(int amount) {
        this.foodAmount += amount;
        System.out.printf("В миску положили %d еды. Теперь в ней %d еды\n", amount, foodAmount);
    }

    //из миски берут еду
    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
    }

    //узнаем сколько еды в миске
    public int getFoodAmount() {
        return foodAmount;
    }
}
