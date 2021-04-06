package com.github.panarik.javaLesson.ui.gameSample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;
    private static final int WINDOW_POS_X = 400;
    private static final int WINDOW_POS_Y = 50;

    private GameMap map;

    GameWindow() {

        //создаём окно настроек, передаем в него текущий GameWindow для привязки расположения
        SettingsWindow settingsWindow = new SettingsWindow(this);
        //создаём окно с игровым полем
        GameMap gameMap = new GameMap();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setTitle("MyGame");
        setResizable(false);

        JButton buttonStart = new JButton("<html><body><b>Start</b></body></html>");
        JButton buttonStop = new JButton("<html><body><b>EXIT</b></body></html>");

        //создаём панель с кнопками
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(buttonStart);
        buttonPanel.add(buttonStop);

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //при клике показываем окно
                settingsWindow.setVisible(true);
            }
        });
        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime.getRuntime().exit(0);
            }
        });

        //добавляем панель в BorderLayout
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);


    }



}
