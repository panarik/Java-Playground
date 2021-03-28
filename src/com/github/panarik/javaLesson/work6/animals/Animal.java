package com.github.panarik.javaLesson.work6.animals;

public abstract class Animal { //сделал абстрактным чтобы не создавать сущностей типа Animal

   /*
    * 2. Все животные могут бежать и плыть.
    * В качестве параметра каждому методу передается длина препятствия.
    * Результатом выполнения действия будет печать в консоль.
    * (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    */

    protected void run(int meters) {
        System.out.println();
    }

}
