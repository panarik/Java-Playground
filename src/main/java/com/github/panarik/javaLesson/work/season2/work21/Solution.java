package com.github.panarik.javaLesson.work.season2.work21;

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
        System.out.println("\nВсе просто прыгают");
        cat1.jump();
        robot1.jump();
        human1.jump();

        System.out.println("\nЗадание 2.\nВсе прыгают через стену");
        cat1.jumpOverWall(10);
        cat1.jumpOverWall(80);
        robot1.jumpOverWall(200);
        robot1.jumpOverWall(1000);
        human1.jumpOverWall(150);
        human1.jumpOverWall(300);

        System.out.println("\nВсе бегут по беговой дорожке");
        cat1.runOnTable(1);
        cat1.runOnTable(5);
        robot1.runOnTable(100);
        robot1.runOnTable(1000);
        human1.runOnTable(20);
        human1.runOnTable(100);

        System.out.println("\nЗадание 3.\nПрыгаем через стену созданную как объект");
        Wall wall1 = new Wall(50);
        cat1.jumpOverObjectWall(wall1);
        robot1.jumpOverObjectWall(wall1);
        human1.jumpOverObjectWall(wall1);
        System.out.println("\nБегаем по беговой дорожке созданной как объект");
        RunTable runTable1 = new RunTable(10);
        cat1.runOnObjectTable(runTable1);
        robot1.runOnObjectTable(runTable1);
        human1.runOnObjectTable(runTable1);


        System.out.println("\nПод конец пробегаем и пропрыгиваем в формате массива");
        Wall[] walls = new Wall[3];
        walls[0] = new Wall(10);
        walls[1] = new Wall(50);
        walls[2] = new Wall(500);

        RunTable[] runTables = new RunTable[3];
        runTables[0] = new RunTable(1);
        runTables[1] = new RunTable(20);
        runTables[2] = new RunTable(500);

        for (int i=0; i < walls.length; i++) {
            cat1.jumpOverObjectWall(walls[i]);
            robot1.jumpOverObjectWall(walls[i]);
            human1.jumpOverObjectWall(walls[i]);
        }
        for (int i=0; i < runTables.length; i++) {
            cat1.runOnObjectTable(runTables[i]);
            robot1.runOnObjectTable(runTables[i]);
            human1.runOnObjectTable(runTables[i]);
        }

    }




}
