package com.banana.textgame;

import com.banana.textgame.enums.Faculty;
import com.banana.textgame.enums.ITArea;

import static com.banana.textgame.enums.Faculty.IT;

public abstract class ITStudent extends DigitalBananaStudent {

    public abstract ITArea getITArea();

    @Override
    public Faculty getFaculty() {
        return IT;
    }

}
