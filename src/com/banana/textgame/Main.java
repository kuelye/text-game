package com.banana.textgame;

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
        for (int i = 1; i <= 5; ++i) {
            onNewDay(i);
        }
        onFinish();
    }

    /*
     * Метод вызывается один раз при старте игры.
     */
    void onStart() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Кто вы такой?");
        String имя = keyboard.nextLine();
        System.out.println("Привет, " + имя + "!");
    }

    int dollars = 0;

    /*
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {
        System.out.println("День номер " + dayNumber + ".");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ваше действие:");
        String action = keyboard.nextLine();

        if (action.equals("кофе")) {
            dollars = dollars - 2;
            System.out.println("Кофе, ура!");
        } else if (action.equals("код")) {
            System.out.println("Ваш код на сегодня:");
            String код = keyboard.nextLine();
            dollars = dollars + код.length();
            System.out.println("Ваш счёт: " + dollars + "$.");
        } else {
            System.out.println("Операция не поддерживается.");
        }
    }

    /*
     * Метод вызывается по завершению игры.
     */
    void onFinish() {

    }

}
