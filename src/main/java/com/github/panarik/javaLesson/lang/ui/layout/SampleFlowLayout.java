package com.github.panarik.javaLesson.lang.ui.layout;

import javax.swing.*;
import java.awt.*;

public class SampleFlowLayout {

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
            JButton button1 = new JButton("FlowLayout_Button1");
            JButton button2 = new JButton("FlowLayout_Button2");

            //задаём layout
            setLayout(new FlowLayout());

            //добавляем кнопки
            add(button1);
            add(button2);

            //указываем свойства
            button1.setPreferredSize(new Dimension(200, 30));
            button2.setPreferredSize(new Dimension(200, 30));


        }
    }
}
