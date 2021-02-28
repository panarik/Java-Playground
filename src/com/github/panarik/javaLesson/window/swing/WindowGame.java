package com.github.panarik.javaLesson.window.swing;

import javax.swing.*;
import java.awt.*;

public class WindowGame extends JFrame {

    private static WindowGame window_game;


    public static void main(String[] args) {

        window_game = new WindowGame(); //создаём новый объект окна
        window_game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //при закрытии окна программа будет остатавливаться
        window_game.setLocation(200, 100); //координаты начальной точки окна
        window_game.setSize(906, 478); //размеры окна
        window_game.setResizable(false); // размеры окна не изменяются пользователем

        //создаём кастомный объект отрисовки поля (со всем содержимым, что мы написали) и добавляем его в созданное окно
        FieldGame field_game = new FieldGame();
        window_game.add(field_game);

        window_game.setVisible(true); //окно непрозрачное
    }


    //метод позволяющий рисовать что-то внутри окна
    private static void onRepaint(Graphics g) {
        g.fillOval(10, 10, 200, 100);
    }


    //Рисовать в окне будем с помощью использования полей JPanel
    private static class FieldGame extends JPanel {

        //переписываем стандартный метод paintComponent для отрисовки чего-то своего внутри поля JPanel
        @Override
        protected void paintComponent(Graphics g) { //вместо пустоты будем передавать в метод paintComponent наш объект "g" класса Graphics
            //1. создание поля
            super //получаем доступ к классу JPanel
                    .paintComponent(g); //передаём в paintComponent() класса JPanel наш объект "g"
            //2. рисуем что-то внутри поля
            onRepaint(g); //передаём туда же наш метод позволяющий нам что-то рисовать своё


        }

    }


}
