package me.jDev.mathQuiz.gui.custom;

import lombok.Getter;
import lombok.Setter;
import me.jDev.mathQuiz.Main;
import me.jDev.mathQuiz.gui.MainGUI;
import me.jDev.mathQuiz.gui.MultiAnswerPanel;

import javax.swing.*;

@Getter
public class AnswerButton extends JButton {
    public final boolean right;
    public AnswerButton(int text, boolean isRight) {
        super(String.valueOf(text));
        this.right = isRight;
    }
}
