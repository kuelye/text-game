package com.banana.textgame;

import java.util.Scanner;

public class Main {

    static String[] доступныеЯзыки = {"Java", "Python", "JavaScript", "C++", "Brainfuck"};
    Scanner keyboard = new Scanner(System.in);
    User пользователь = new User();

    /*
     * Главный метод. :/
     */
    public static void main(String[] args) {
        // вызывает метод start()
        Main main = new Main();
        main.start();
    }

    /*
     * Метод с логикой игры.
     */
    private void start() {
        onStart();
        for (int i = 1; i <= 31; i = i + 2) {
            onNewDay(i);
            if (пользователь.tired) {
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

    /*
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {
        System.out.println("День номер " + dayNumber + ".");
        пользователь.printInfo();

        System.out.println("Ваше действие:");
        String action = keyboard.nextLine();
        switch (action.toLowerCase()) {
            case "изучить":
                learnLanguage();
                break;
            case "кофе":
                пользователь.dollars = пользователь.dollars - 2;
                System.out.println("Кофе, ура!");
                break;
            case "пицца":
                Pizza pizza = new Pizza();
                съесть(pizza);
                break;
            case "хлопушки":
                съесть(new Hlopushki());
                break;
            case "код":
                System.out.println("Ваш код на сегодня:");
                String код = keyboard.nextLine();
                пользователь.dollars = пользователь.dollars + код.length();
                break;
            case "устал":
                пользователь.tired = true;
                break;
            case "работа":
                найтиРаботу();
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
                пользователь.известныеЯзыки[i] = true;
                пользователь.dollars -= 20;
            }
        }
    }

    void съесть(Food еда) {
        boolean корректныйВвод = false;
        while (корректныйВвод == false) {
            System.out.println("Сколько кусков еды?");
            String строка = keyboard.nextLine();
            try {
                int количествоКусков = Integer.parseInt(строка);
                съесть(еда, количествоКусков);
                корректныйВвод = true;
            } catch (Exception e) {
                System.out.println("Ошибочка. :с");
            }
        }
    }

    void съесть(Food еда, int количествоКусков) {
        System.out.println("Вы скушали " + количествоКусков + " кусков еды.");
        пользователь.dollars -= еда.getPriceN(количествоКусков);
    }

    void найтиРаботу(){
        System.out.println("Какую Работу Хотите?");
        String компания = keyboard.nextLine();
        пользователь.компании.add(компания);
    }

    int верниОчки() {
        int очки = пользователь.dollars;
        for (int i = 0; i < пользователь.известныеЯзыки.length; i += 1) {
            if (пользователь.известныеЯзыки[i] == true) {
                очки += 10;
            }
        }

        return очки;
    }

}
