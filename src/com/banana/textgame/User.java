package com.banana.textgame;

import java.util.ArrayList;

public class User {

    int dollars = 0;
    int mood = 3;
    boolean[] изученныеЯзыки = {true, false, false, false, false, false, false};
    ArrayList<String> компании = new ArrayList<>();
    String[] доступныеЯзыки = {"Java", "Python", "Kotlin", "Pascal", "Ada", "C", "JavaScript"};

    void printMoney() {
        System.out.println("Ваш счёт: " + dollars + "$.");
    }

    void printMood() {
        String smiles = "";
        for (int i = 1; i <= mood; i = i + 1) {
            smiles = smiles + "☺";
        }
        System.out.println("Ваше настроение: " + smiles + ".");
    }

    void напечатайИзученныеЯзыки() {
        System.out.println("Вы знаете языки:");
        for (int i = 0; i < изученныеЯзыки.length; i++) {
            if (изученныеЯзыки[i] == true) {
                System.out.println(" • " + доступныеЯзыки[i]);
            }
        }
    }

}
