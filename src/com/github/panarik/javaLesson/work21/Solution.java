package com.github.panarik.javaLesson.work21;

public class Solution {

    /*
     * Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
     * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
     *
     * Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
     * результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
     *
     * Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
     * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
     * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
     */

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Robot robot1 = new Robot();
        Human human1 = new Human();

        System.out.println("Задание 1.\nВсе просто бегут");
        cat1.run(1);
        robot1.run(150);
        human1.run(150);
        System.out.println("Все просто прыгают");
        cat1.jump();
        robot1.jump();
        human1.jump();

        System.out.println("Задание 2.\nВсе прыгают через стену");
        cat1.jumpOverWall(10);
        cat1.jumpOverWall(80);
        robot1.jumpOverWall(200);
        robot1.jumpOverWall(1000);
        human1.jumpOverWall(150);
        human1.jumpOverWall(300);

        System.out.println("Все бегут по беговой дорожке");
        cat1.runOnTable(1);
        cat1.runOnTable(5);
        robot1.runOnTable(100);
        robot1.runOnTable(1000);
        human1.runOnTable(20);
        human1.runOnTable(100);

    }




}
