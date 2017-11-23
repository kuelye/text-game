package com.banana.textgame;

import java.util.ArrayList;

public class User {

    public boolean tired = false;
    public int dollars = 0;
    public boolean[] известныеЯзыки = {true, false, false, false, false};
    public ArrayList компании = new ArrayList();

    void printInfo() {
        String dollarsString = "";
        for (int i = 0; i < dollars; i += 1) {
            dollarsString = dollarsString + "$";
        }
        System.out.println("Компании, в которых вы работаете:");
        for (int i = 0; i < компании.size(); i += 1) {
            System.out.println("- " + компании.get(i));
        }
        System.out.println("Ваш счёт: " + dollarsString + ".");
        напечатайИзвестныеЯзыки();
    }

    void напечатайИзвестныеЯзыки() {
        System.out.println("Вы знаете следующие языки:");
        for (int i = 0; i < Main.доступныеЯзыки.length; ++i) {
            if (известныеЯзыки[i] == true) {
                System.out.println(Main.доступныеЯзыки[i]);
            }
        }
    }

}
