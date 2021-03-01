package com.github.panarik.javaLesson.window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

//
public class WindowGame extends JFrame {

    private static WindowGame window_game;
    //создаём переменные тайминга анимации
    private static long last_frame_time; // подсчет кадров анимации

    //создаём ресурсы
    private static Image background;
    private static Image game_over;
    private static Image drop;
    //создаём переменные положения капли
    private static float drop_left = 200; //координата X капли
    private static float drop_top = -100; //координата Y капли
    private static float drop_v = 200; //скорость капли

    public static void main(String[] args) throws IOException {

        //импортируем картинки
        background = ImageIO.read(WindowGame.class.getResourceAsStream("background.png"));
        game_over = ImageIO.read(WindowGame.class.getResourceAsStream("game_over.png"));
        drop = ImageIO.read(WindowGame.class.getResourceAsStream("drop.png"));

        window_game = new WindowGame(); //создаём новый объект окна
        window_game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //при закрытии окна программа будет остатавливаться
        window_game.setLocation(200, 100); //координаты начальной точки окна
        window_game.setSize(906, 478); //размеры окна
        window_game.setResizable(false); // размеры окна не изменяются пользователем

        //работаем с таймингом анимации до создания фрейма
        last_frame_time = System.nanoTime(); //начальный кадр (текущее время в наносекундах - время начала прокрутки анимации, т.к. запускается один раз в начале)

        //создаём кастомный объект отрисовки поля (со всем содержимым, что мы написали) и добавляем его в созданное окно
        FieldGame field_game = new FieldGame();
        window_game.add(field_game);

        window_game.setVisible(true); //окно непрозрачное
    }


    //метод позволяющий рисовать что-то внутри окна (вместе с методом repaint() получаем цикличную отрисовку каждый кадр)
    private static void onRepaint(Graphics g) {

        //работаем с таймингом отрисовки
        long current_time = System.nanoTime(); //текущее время во время отрисовки каждого кадра в цикле
        float delta_time = (current_time - last_frame_time) * 0.000000001f; // delta_time = текущее время МИНУС время предыдущего кадра
        last_frame_time = current_time; //обновляем время предыдущего кадра, чтобы корректно считалась разница

        //в цикл добавляем изменения координат капли исходя из:
        drop_top = drop_top + drop_v * delta_time;

        //добавляем к объекту растровые картинки
        g.drawImage(background, 0, 0, null);
//        g.drawImage(game_over, 0, 0, null);
        g.drawImage(drop, (int)drop_left, (int)drop_top, null);
        //добавляем к объекту векторную графику
//        g.fillOval(10, 10, 200, 100);
        //бобавляем лог для дебага
        System.out.println(current_time);
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
            repaint(); //зацикливаем отрисовку


        }

    }


}
