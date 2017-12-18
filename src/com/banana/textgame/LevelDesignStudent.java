package com.banana.textgame;

import java.util.Arrays;

public class LevelDesignStudent extends GameDevStudent implements IUnityMaster, IDesignStudent {

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
        return super.toString() + " Уроверь владения Unity: " + getUnitySkillLevel() + ".";
    }

}
