package com.github.panarik.javaLesson.lessons.lang.generic.model;

public class BoxNumbers<N extends Number> { //N либо Number, либо наследник

    private N[] numbers;

    public BoxNumbers(N... numbers) {
        this.numbers = numbers;
    }

    public N[] getNumbers() {
        return numbers;
    }

    public void setNumbers(N[] numbers) {
        this.numbers = numbers;
    }

    public double sum() {
        double sum = 0.0;
        for (N number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public double avg() {
        return sum() / numbers.length;
    }

    public boolean equalsByAvg(BoxNumbers<N> another) { //сравниваем только с аналогичными данными
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }

    public boolean equalsByAvg1(BoxNumbers<?> another) { //сравниваем с любыми данными
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }

    public boolean equalsByAvgExtends(BoxNumbers<? extends Number> another) { //сравниваем с любыми данными класса Number или его ПОТОМКОВ
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }

    public boolean equalsByAvgSuper(BoxNumbers<? super Number> another) { //сравниваем с любыми данными класса Number или его РОДИТЕЛЕЙ
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}
