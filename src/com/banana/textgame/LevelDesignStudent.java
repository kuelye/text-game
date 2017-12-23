package com.banana.textgame;

import java.util.Arrays;

public class LevelDesignStudent extends GameDevStudent implements IUnityMaster, IDesignStudent, Comparable<LevelDesignStudent> {

    String surname;
    int age;

    public LevelDesignStudent(String newName) {
        name = newName;
    }

    public LevelDesignStudent(String newName, String newSurname, int newAge) {
        name = newName;
        surname = newSurname;
        age = newAge;
    }

    @Override
    public String[] getSkills() {
        return new String[]{"Unity", "3D Max", "Blender"};
    }

    public int getUnitySkillLevel() {
        return 27;
    }

    public boolean knowPhotoshop() {
        return false;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public int compareTo(LevelDesignStudent o) {
        if (name.equals(o.name)) { // если имена совпадают, то
            return surname.compareTo(o.surname); // сортируем по фамилии
        } else { // иначе
            return name.compareTo(o.name); // сортируем по имени
        }
    }

}
