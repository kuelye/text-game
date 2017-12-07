package com.banana.textgame;

public abstract class Food {

    int getPriceN(int number) {
        return number * getPrice1();
    }

}
