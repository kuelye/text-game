package com.banana.textgame;

import com.banana.textgame.enums.ITArea;

import static com.banana.textgame.enums.ITArea.WEB;

public class WebStudent extends ITStudent {

    @Override
    public ITArea getITArea() {
        return WEB;
    }

    @Override
    public String[] getSkills() {
        return new String[]{"HTML", "CSS", "JS"};
    }

}
