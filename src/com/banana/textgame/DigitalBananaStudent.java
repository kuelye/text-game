package com.banana.textgame;

import com.banana.textgame.enums.Faculty;

import java.util.Arrays;

public abstract class DigitalBananaStudent {

    public String name;

    public abstract Faculty getFaculty();
    public abstract String[] getSkills();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Привет, я - " + name + ". Скоро буду знать: " + Arrays.toString(getSkills()) + ".";
    }

}
