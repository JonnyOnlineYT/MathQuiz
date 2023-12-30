package me.jDev.mathQuiz.gui;

import me.jDev.mathQuiz.Main;
import me.jDev.mathQuiz.Util;
import me.jDev.mathQuiz.gui.custom.AnswerButton;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class MultiAnswerPanel extends JPanel {
    public MultiAnswerPanel(String text, AnswerButton[] answers) {
        this.setLayout(new GridLayout(2, 1));
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        ArrayList<AnswerButton> list = Arrays.stream(answers).collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(list);
        list.forEach(answerButton -> {
            panel.add(answerButton);
            answerButton.addActionListener(actionListener -> {
                if (answerButton.isRight()) {
                    Main.score++;
                }
                Main.questionCount++;
                MainGUI.instance.remove(this);
                MainGUI.instance.add(Util.genScreen());
                MainGUI.instance.revalidate();
                MainGUI.instance.repaint();
            });
        });
        add(panel);
    }
}
