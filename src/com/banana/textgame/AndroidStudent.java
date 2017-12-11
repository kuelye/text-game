package com.banana.textgame;

import com.banana.textgame.enums.ITArea;

import static com.banana.textgame.enums.ITArea.MOBILE;

public class AndroidStudent extends ITStudent {

    @Override
    public ITArea getITArea() {
        return MOBILE;
    }

    @Override
    public String[] getSkills() {
        return new String[]{"Java", "Android"};
    }

}
