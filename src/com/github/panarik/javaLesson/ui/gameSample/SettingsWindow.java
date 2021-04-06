package com.github.panarik.javaLesson.ui.gameSample;

import javax.swing.*;
import java.awt.*;

public class SettingsWindow extends JFrame {

    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_HEIGHT = 350;
    private static final int MIN_WIN_LENGTH = 3;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    private GameWindow gameWindow;
    private JSlider sliderWinLength;
    private JSlider sliderFieldSize;
    private JRadioButton humanVsAI;
    private JRadioButton humanVsHuman;

    SettingsWindow(GameWindow gameWindow) {
        //сетапим окно
        this.gameWindow = gameWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(gameWindow);
        setTitle("Create new game");
        setResizable(false);

        //создаём layout
        setLayout(new GridLayout(10,1));

        addGameMod();


        JLabel labelFieldSize = new JLabel("Field size: "+MIN_FIELD_SIZE);
        JLabel labelWinLength = new JLabel("Win length: "+MIN_WIN_LENGTH);
        add(labelFieldSize);
        add(labelWinLength);



    }

    private void addGameMod() {
        add(new JLabel("Выберите тип игры:"));
        //создаём и добавляем кнопки
        humanVsAI = new JRadioButton("Human VS AI", true);
        humanVsHuman = new JRadioButton("Human VS Human");
        add(humanVsAI);
        add(humanVsHuman);
        //создаём группу кнопок чтобы нажимались по очереди
        ButtonGroup gameMode = new ButtonGroup();
        gameMode.add(humanVsAI);
        gameMode.add(humanVsHuman);
    }


}
