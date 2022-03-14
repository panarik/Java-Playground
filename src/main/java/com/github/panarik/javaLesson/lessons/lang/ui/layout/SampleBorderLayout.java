package com.github.panarik.javaLesson.lessons.lang.ui.layout;

import javax.swing.*;
import java.awt.*;

public class SampleBorderLayout {

    public static void main(String[] args) {
        new SampleWindow();



    }

    public static class SampleWindow extends JFrame {
        SampleWindow(){
            setSize(500,500);
            setLocation(400, 100);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            //создаём кнопки
            JButton button1 = new JButton("BorderLayout_Button_NORTH");
            JButton button2 = new JButton("BorderLayout_Button_SOUTH");

            //добавляем кнопки, указываем расположение
            add(button1, BorderLayout.NORTH);
            add(button2, BorderLayout.SOUTH);

            //указываем свойства
            button1.setPreferredSize(new Dimension(200, 30));
            button2.setPreferredSize(new Dimension(200, 30));


        }
    }
}
