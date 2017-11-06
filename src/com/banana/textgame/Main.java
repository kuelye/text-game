package com.banana.textgame;

import java.util.Scanner;

public class Main {

    /*
     * Главный метод.
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
        System.out.println("Добро пожаловать в симулятор ...");

        Scanner клавиатура = new Scanner(System.in);
        System.out.println("Как тебе зовут?");
        String имя = клавиатура.nextLine();
        System.out.println("Здравствуй, " + имя);
    }

    int dollars = 0;

    /*
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {
        System.out.println("День номер " + dayNumber + ".");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ваш код на сегодня:");
        String код = keyboard.nextLine();
        dollars = dollars + код.length();

        System.out.println("Ваш счёт: " + dollars + "$.");
    }

    /*
     * Метод вызывается по завершению игры.
     */
    void onFinish() {

    }

}
