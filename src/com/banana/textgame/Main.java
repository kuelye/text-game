package com.banana.textgame;

import java.util.Scanner;

public class Main {

    /*
     * Главный метод. :с :c
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
        System.out.println("Сколько тебе лет?");
        int возраст = клавиатура.nextInt();
        клавиатура.nextLine();

        System.out.println("Как тебе зовут?");
        String имя = клавиатура.nextLine();
        System.out.println("Привет, " + имя);
    }

    /*
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {

    }

    /*
     * Метод вызывается по завершению игры.
     */
    void onFinish() {

    }

}
