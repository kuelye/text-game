package com.banana.textgame;

public class Food {

    public int getСтоимость() {
        return 0;
    }

    public int getЖирок() {
        return 0;
    }

    public int дайОбщуюСтоимость(int количество) {
        return getСтоимость() * количество;
    }

    public int дайОбщийЖирок(int количество) {
        return getЖирок() * количество;
    }

}
