package com.github.panarik.javaLesson.lang.ui.graphics2.sample.swing;

import javax.swing.*;

public class Example1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MyWindow::new);
        System.out.println("Bye main!");
    }
}

class MyWindow extends JFrame {
    MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);
    }

}
