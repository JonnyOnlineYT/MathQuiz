package me.jDev.mathQuiz.gui;

import me.jDev.mathQuiz.Main;
import me.jDev.mathQuiz.Util;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.lang.invoke.VolatileCallSite;

public class InputPanel extends JPanel {
    public InputPanel(String question, String answer) {
        setLayout(new GridLayout(2, 1));
        JLabel label = new JLabel(question);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        JTextField answerField = new JTextField();
        panel.add(answerField);
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(actionListener -> {
            if (answerField.getText().equals(answer)) {
                Main.score++;
            }
            Main.questionCount++;
            MainGUI.instance.remove(this);
            MainGUI.instance.add(Util.genScreen());
            MainGUI.instance.revalidate();
            MainGUI.instance.repaint();
        });
        panel.add(confirmButton);
        add(panel);
    }
}
