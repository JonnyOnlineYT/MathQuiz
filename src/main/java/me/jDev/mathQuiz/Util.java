package me.jDev.mathQuiz;

import me.jDev.mathQuiz.gui.EndScreen;
import me.jDev.mathQuiz.gui.InputPanel;
import me.jDev.mathQuiz.gui.MultiAnswerPanel;
import me.jDev.mathQuiz.gui.custom.AnswerButton;

import javax.swing.*;
import java.util.Random;

public class Util {
    public static JPanel genScreen() {
        if (Main.questionCount==10) {
            return new EndScreen();
        }
        int a = new Random().nextInt(10)+1;
        int b = new Random().nextInt(10)+1;
        if (new Random().nextBoolean()) {
            return new InputPanel(a+"+"+b, String.valueOf(a+b));
        }
        int wrong1;
        do {
            wrong1 = new Random().nextInt(20)+1;
        } while (wrong1 == a+b);
        int wrong2;
        do {
            wrong2 = new Random().nextInt(20)+1;
        } while (wrong2 == a+b);
        return new MultiAnswerPanel(a+"+"+b, new AnswerButton[] {new AnswerButton(a+b, true), new AnswerButton(wrong2, false), new AnswerButton(wrong1, false)});
    }
}
