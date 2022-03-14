package com.github.panarik.javaLesson.lessons.lang.ui.action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleActions {

    public static void main(String[] args) {
        new SampleWindow();
    }

    public static class SampleWindow extends JFrame {
        private int count = 0;
        SampleWindow() {
            setSize(500, 500);
            setLocation(400, 100);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("My Example");

            JButton button1 = new JButton("JPanel_BoxLayout_Button1");
            JButton button2 = new JButton("Кликни по мне!");


            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            add(panel, BorderLayout.SOUTH);

            panel.add(button1);
            panel.add(button2);

            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count++;
                    button2.setText("Клик №"+count);
                }
            });

        }
    }
}
