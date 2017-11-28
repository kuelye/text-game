package com.banana.textgame;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Message {

    long date;
    String message;
    long sender;
    long receivet;

    String getDate(){
        if (isSentToday()) {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Date d = new Date(date * 1000);
            return format.format(d);
        } else {
            SimpleDateFormat format = new SimpleDateFormat("dd MMMM HH:mm:ss");
            Date d = new Date(date * 1000);
            return format.format(d);
        }
    }

    boolean isSentToday() {
        Calendar calendar = Calendar.getInstance();
        int текущийДеньВГоду = calendar.get(Calendar.DAY_OF_YEAR); // 1 для 1 января
        int текущийГод = calendar.get(Calendar.YEAR); // 1 для 1 января
        calendar.setTime(new Date(date * 1000));
        int деньВГодуСообщения = calendar.get(Calendar.DAY_OF_YEAR); // 1 для 1 января
        int годСообщения = calendar.get(Calendar.YEAR);

        if (текущийДеньВГоду == деньВГодуСообщения
                && текущийГод == годСообщения) {
            return true;
        } else {
            return false;
        }
    }

}

