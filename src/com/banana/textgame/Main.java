package com.banana.textgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;

class Main {

    public static void main(String[] args) {
        LevelDesignStudent иван = new LevelDesignStudent("Иван");
        LevelDesignStudent хан = new LevelDesignStudent("Хан", "Соло", 75);
        LevelDesignStudent пафнутий1 = new LevelDesignStudent("Пафнутий", "Пафнутьев", 27);
        LevelDesignStudent пафнутий2 = new LevelDesignStudent("Пафнутий", "Ахаха", 66);

        ArrayList<LevelDesignStudent> группа = new ArrayList<>();
        группа.add(иван);
        группа.add(хан);
        группа.add(пафнутий1);
        группа.add(пафнутий2);

        Collections.sort(группа);
        System.out.println(группа);
    }

}
