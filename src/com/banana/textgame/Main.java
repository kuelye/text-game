package com.banana.textgame;

import java.util.ArrayList;
import java.util.List;
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
        String[] варианты = {"Как тебя зовут?", "Здрасьте, ваше имя?", "Пиу-пиу-пиу."};
        int числоОт0доN = (int) (Math.random() * варианты.length);
        System.out.println(варианты[числоОт0доN]);
        String имя = клавиатура.nextLine();
        System.out.println("Здравствуй, " + имя);
    }

    // ГЛОБАЛЬНЫЕ ПЕРЕМЕННЫЕ

    int dollars = 0;
    int mood = 3;
    String[] доступныеЯзыки = {"Java", "Python", "Kotlin", "Pascal", "Ada", "C", "JavaScript"};
    boolean[] изученныеЯзыки = {true, false, false, false, false, false, false};
    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> компании = new ArrayList<>();

    /*
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {
        System.out.println("День номер " + dayNumber + ".");
        System.out.println("Ваш счёт: " + dollars + "$.");
        String smiles = "";
        for (int i = 1; i <= mood; i = i + 1) {
            smiles = smiles + "☺";
        }
        System.out.println("Ваше настроение: " + smiles + ".");
        напечатайИзученныеЯзыки();
        System.out.println("Компании, в которых вы работаете: " + компании + ".");

        System.out.println("Чего делать будем?");
        String action = keyboard.nextLine();
        switch (action.toLowerCase()) {
            case "работа":
                найтиРаботу();
                break;
            case "изучить":
                изучитьЯзык();
                break;
            case "код":
                // пишём код
                System.out.println("Ваш код на сегодня:");
                String код = keyboard.nextLine();
                dollars = dollars + код.length();
                mood = mood - 1;
                break;

            case "пельмешки":
                скушатьПельмешки();
                break;
            case "скакалка":
                // прыгаем на скакалке
                System.out.println("Окей, вы попрыгали на скакалке.");
                mood = mood + 2;
                break;
            case "играть":
                броситьКость();
                break;
            default:
                // отображаем ошибку
                System.out.println("Ошибка.");
        }
    }

    /*
     * Метод вызывается по завершению игры.
     */
    void onFinish() {
        System.out.println("количество набранных очков:" + верниФинальныеОчки() );
    }

    // ДЕЙСТВИЯ

    void изучитьЯзык() {
        System.out.println("А какой язык?");
        String выбранныйЯзык = keyboard.nextLine();

        for (int i = 0; i < доступныеЯзыки.length; i++) {
            if (доступныеЯзыки[i].equals(выбранныйЯзык)) {
                if ((изученныеЯзыки[i] == false) && mood > 0 && dollars >= 20) {
                    изученныеЯзыки[i] = true;
                    dollars -= 20;
                    mood -= 1;
                } else if (mood == 0) {
                    System.out.println("Вам слишком грустно.");
                } else if (dollars < 20) {
                    System.out.println("У вас совсем нет денег.");
                } else if (изученныеЯзыки[i] == true) {
                    System.out.println("Вы уже знаете этот язык.");
                }

                return;
            }
        }
    }

    void изучитьЯзык(String язык) {
        System.out.println("Вы изучили " + язык + ".");
    }

    void напечатайИзученныеЯзыки() {
        System.out.println("Вы знаете языки:");
        for (int i = 0; i < изученныеЯзыки.length; i++) {
            if (изученныеЯзыки[i] == true) {
                System.out.println(" • " + доступныеЯзыки[i]);
            }
        }
    }

    void скушатьПельмешки() {
        boolean данныеВведеныВерно = false;
        while (данныеВведеныВерно == false) {
            System.out.println("сколько пельмешек?");
            String строка = keyboard.nextLine();
            try {
                int количествоПельмешек = Integer.parseInt(строка);
                скушатьПельмешки(количествоПельмешек);
                данныеВведеныВерно = true;
            } catch (Exception e) {
                System.out.println("Ошибка парсинга. :с");
            }
        }
    }

    void скушатьПельмешки(int количествоПельмешек) {
        dollars = dollars - 5 * количествоПельмешек;
        mood = mood + 5 * количествоПельмешек;
    }

    int верниФинальныеОчки () {
        int очки = dollars * 2 + mood * 6;
        for (int i = 0; i < изученныеЯзыки.length; i++) {
            if (изученныеЯзыки[i] == true) {
                очки = очки + 4;

            }
        }
        return очки;
    }

    void найтиРаботу() {
        System.out.println("В какой компании будете работать?");
        String компания = keyboard.nextLine();
        компании.add(компания);
    }

    void броситьКость() {
        int число1 = (int) (Math.random() * 6 + 1);
        int число2 = (int) (Math.random() * 6 + 1);
        System.out.println("Вам выпали: " + String.valueOf(число1) + " и " + String.valueOf(число2) + ".");
        dollars -= 1;
        if (Math.max(число1, число2) % 2 == 0) {
            System.out.println("Ура, вы выиграли!");
            dollars += 5;
        }
    }

}
