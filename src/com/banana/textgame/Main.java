package com.banana.textgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*
     * Главный метод. :/
     */
    public static void main(String[] args) {
        // вызывает метод start()
        new Main().start();
    }

    /*
     * Метод с логикой игры.
     */
    private void start() {
        onStart();
        for (int i = 1; i <= 31; i = i + 2) {
            onNewDay(i);
            if (tired) {
                break;
            }
        }
        onFinish();
    }

    /*
     * Метод вызывается один раз при старте игры.
     */
    void onStart() {
        Scanner keyboard = new Scanner(System.in);
        String[] vs = {"Кто вы такой?", "Здравствуйте, представьтесь.", "Архрргхххх."};
        String v = vs[(int) (Math.random() * vs.length)];
        System.out.println(v);
        String имя = keyboard.nextLine();
        System.out.println("Привет, " + имя + "!");
    }

    // ГЛОБАЛЬНЫЕ ПЕРЕМЕННЫЕ

    boolean tired = false;
    int dollars = 0;
    String[] доступныеЯзыки = {"Java", "Python", "JavaScript", "C++", "Brainfuck"};
    boolean[] известныеЯзыки = {true, false, false, false, false};
    Scanner keyboard = new Scanner(System.in);

    /*
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {
        System.out.println("День номер " + dayNumber + ".");
        String dollarsString = "";
        for (int i = 0; i < dollars; i += 1) {
            dollarsString = dollarsString + "$";
        }
        System.out.println("Ваш счёт: " + dollarsString + ".");
        напечатайИзвестныеЯзыки();

        System.out.println("Ваше действие:");
        String action = keyboard.nextLine();

        switch (action.toLowerCase()) {
            case "изучить":
                learnLanguage();
                break;
            case "кофе":
                dollars = dollars - 2;
                System.out.println("Кофе, ура!");
                break;
            case "пицца":
                съестьПицку();
                break;
            case "код":
                System.out.println("Ваш код на сегодня:");
                String код = keyboard.nextLine();
                dollars = dollars + код.length();
                break;
            case "устал":
                tired = true;
                break;
            default:
                System.out.println("Операция не поддерживается.");
        }
    }

    /*
     * Метод вызывается по завершению игры.
     */
    void onFinish() {
        System.out.print("Пока-пока, вы набрали очков: " + верниОчки());
    }

    // ДЕЙСТВИЯ

    void learnLanguage() {
        System.out.println("Какой язык будем учить?");
        String выбранныйЯзык = keyboard.nextLine();

        for (int i = 0; i < доступныеЯзыки.length; ++i) {
            if (доступныеЯзыки[i].equals(выбранныйЯзык)) {
                известныеЯзыки[i] = true;
                dollars -= 20;
            }
        }
    }

    void напечатайИзвестныеЯзыки() {
        System.out.println("Вы знаете следующие языки:");
        for (int i = 0; i < доступныеЯзыки.length; ++i) {
            if (известныеЯзыки[i] == true) {
                System.out.println(доступныеЯзыки[i]);
            }
        }
    }

    void съестьПицку() {
        System.out.println("Сколько кусков пицки?");
        int количествоКусков = keyboard.nextInt();
        keyboard.nextLine();
        съестьПицку(количествоКусков, 2);
    }

    void съестьПицку(int количествоКусков, int стоимостьПиццы) {
        System.out.println("Вы скушали " + количествоКусков + " кусков пицки.");
        dollars -= стоимостьПиццы * количествоКусков;
    }

    int верниОчки() {
        int очки = dollars;
        for (int i = 0; i < известныеЯзыки.length; i += 1) {
            if (известныеЯзыки[i] == true) {
                очки += 10;
            }
        }

        return очки;
    }

}
