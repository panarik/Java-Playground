package com.github.panarik.javaLesson.lang.ui.layout.jpanel;

import javax.swing.*;
import java.awt.*;

public class Sample {

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
            JButton button1 = new JButton("JPanel_BoxLayout_Button1");
            JButton button2 = new JButton("JPanel_BoxLayout_Button2");
            JButton button3 = new JButton("JPanel_BoxLayout_Button3");
            JButton button4 = new JButton("JPanel_BoxLayout_Button4");

            //задаём jpanel
            JPanel panel = new JPanel();

            //ставим layout в jpanel (1 - в столбик)
            //add(panel);
            //panel.setLayout(new BoxLayout(panel, 1));

            //ставим FlowLayout() и BorderLayout layout в jpanel
            panel.setLayout(new FlowLayout());
            add(panel, BorderLayout.SOUTH);

            //добавляем кнопки в jpanel
            panel.add(button1);
            panel.add(button2);
            panel.add(button3);
            panel.add(button4);
        }
    }
}
