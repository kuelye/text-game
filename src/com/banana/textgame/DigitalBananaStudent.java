package com.banana.textgame;

import com.banana.textgame.enums.Faculty;

public abstract class DigitalBananaStudent {

    public String name;

    public abstract Faculty getFaculty();
    public abstract String[] getSkills();

    public String getName() {
        return name;
    }

}
