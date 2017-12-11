package com.banana.textgame;

import com.banana.textgame.enums.ITArea;

import static com.banana.textgame.enums.ITArea.MOBILE;

public class MobileDesignStudent extends ITStudent implements IDesignStudent {

    @Override
    public boolean knowPhotoshop() {
        return true;
    }

    @Override
    public ITArea getITArea() {
        return MOBILE;
    }

    @Override
    public String[] getSkills() {
        return new String[]{"Photoshop"};
    }
}
