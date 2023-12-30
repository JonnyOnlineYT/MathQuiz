package me.jDev.mathQuiz.gui;

import me.jDev.mathQuiz.Util;
import me.jDev.mathQuiz.gui.custom.AnswerButton;

import javax.swing.*;

public class MainGUI extends JFrame {
    public static MainGUI instance;
    public MainGUI() {
        instance = this;
        setSize(800, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(Util.genScreen());

        setVisible(true);
    }
}
