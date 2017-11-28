package com.banana.textgame;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Message {

    long date = -1;
    String text;
    long sender;
    long recevier;
    Calendar calendar = Calendar.getInstance();

    String getDate() {
        if (isSentToday()) {
            SimpleDateFormat formating = new SimpleDateFormat("HH:mm");
            String time = formating.format(calendar.getTime());
            return time;
        } else {
            SimpleDateFormat formating = new SimpleDateFormat("dd MMM YYYY HH:mm:ss");
            String time = formating.format(calendar.getTime());
            return time;
        }
    }

    boolean isSentToday() {
        int currentDayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int currentYear = calendar.get(Calendar.YEAR);
        calendar.setTime(new Date(date * 1000));
        int messageDayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int messageYear = calendar.get(Calendar.YEAR);
        return currentDayOfYear == messageDayOfYear
                && currentYear == messageYear;
    }

}
