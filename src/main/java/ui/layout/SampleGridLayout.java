package com.github.panarik.javaLesson.ui.layout;

import javax.swing.*;
import java.awt.*;

public class SampleGridLayout {

    public static void main(String[] args) {
        new SampleWindow();


    }

    public static class SampleWindow extends JFrame {
        SampleWindow() {
            setSize(500, 500);
            setLocation(400, 100);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            //создаём кнопки
            JButton button1 = new JButton("GridLayout_Button1");
            JButton button2 = new JButton("GridLayout_Button2");
            JButton button3 = new JButton("GridLayout_Button3");
            JButton button4 = new JButton("GridLayout_Button4");

            //задаём layout
            setLayout(new GridLayout(2, 2));

            //добавляем кнопки
            add(button1);
            add(button2);
            add(button3);
            add(button4);
        }
    }
}
