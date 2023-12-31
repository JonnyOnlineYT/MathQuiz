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
        String operation = "";
        int c = 0;
        switch (new Random().nextInt(3)) {
            case 0: {
                c = a+b;
                operation = "+";
                break;
            }
            case 1: {
                c = a-b;
                operation = "-";
                break;
            }
            case 2: {
                c = a*b;
                operation = "*";
                break;
            }
        }
        if (new Random().nextBoolean()) {
            return new InputPanel(a+operation+b, String.valueOf(c));
        }
        int wrong1;
        do {
            wrong1 = new Random().nextInt(20)+1;
        } while (wrong1 == c);
        int wrong2;
        do {
            wrong2 = new Random().nextInt(20)+1;
        } while (wrong2 == c);
        return new MultiAnswerPanel(a+operation+b, new AnswerButton[] {new AnswerButton(c, true), new AnswerButton(wrong2, false), new AnswerButton(wrong1, false)});
    }
}
