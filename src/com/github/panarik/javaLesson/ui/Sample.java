package com.github.panarik.javaLesson.ui;

import javax.swing.*;

public class Sample {

    public static void main(String[] args) {
        new SampleWindow();



    }

    public static class SampleWindow extends JFrame {
        SampleWindow(){
            setSize(720,480);
            setVisible(true);

        }
    }
}
