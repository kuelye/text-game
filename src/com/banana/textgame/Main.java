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
        System.out.println("Кто вы такой?");
        String имя = keyboard.nextLine();
        System.out.println("Привет, " + имя + "!");
    }

    boolean tired = false;
    int dollars = 0;

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

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ваше действие:");
        String action = keyboard.nextLine();

        switch (action.toLowerCase()) {
            case "кофе":
                dollars = dollars - 2;
                System.out.println("Кофе, ура!");
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
        System.out.print("Пока-пока, ваш счет: " + dollars + "$.");
    }

}
