package com.banana.textgame;

import com.banana.textgame.enums.Faculty;

import static com.banana.textgame.enums.Faculty.GAMEDEV;

public abstract class GameDevStudent extends DigitalBananaStudent {

    public Faculty getFaculty(){
        return GAMEDEV;
    }

}
