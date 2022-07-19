package com.java.core.Rdatas;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dateFormats = new DateFormat[7];
        dateFormats[0] = DateFormat.getInstance();
        dateFormats[1] = DateFormat.getDateInstance();
        dateFormats[2] = DateFormat.getDateTimeInstance();
        dateFormats[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dateFormats[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dateFormats[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dateFormats[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : dateFormats) {
            System.out.println(dateFormat.format(c.getTime()));
        }

        Arrays.stream(dateFormats).forEach(dateFormat -> {
            System.out.println(dateFormat.format(c.getTime()));
        });
    }
}
