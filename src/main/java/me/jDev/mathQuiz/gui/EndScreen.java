package me.jDev.mathQuiz.gui;

import me.jDev.mathQuiz.Main;

import javax.swing.*;
import java.awt.*;

public class EndScreen extends JPanel {
    public EndScreen() {
        setLayout(new GridLayout(10, 1));
        JLabel label = new JLabel("The End!");
        JLabel label1 = new JLabel("You Scored " + Main.score + " out of 10!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
        add(label1);
    }
}
