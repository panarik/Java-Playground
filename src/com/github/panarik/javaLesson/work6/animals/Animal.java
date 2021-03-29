package com.github.panarik.javaLesson.work6.animals;

public abstract class Animal { //сделал абстрактным чтобы не создавать сущностей типа Animal

    protected String name;
    protected final int distanceRun = 0;
    protected final int distanceSwim = 0;

   /*
    * 2. Все животные могут бежать и плыть.
    * В качестве параметра каждому методу передается длина препятствия.
    * Результатом выполнения действия будет печать в консоль.
    * (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    */
    public void run(int distanceRun, int distanceSwim) {
        System.out.println(name+" пробежал "+distanceRun+" метров и проплыл "+distanceSwim+" метров.");
    }


}
