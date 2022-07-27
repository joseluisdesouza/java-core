package com.java.core.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //lingua it e pais IT (Italia)
        Locale localeItalia = new Locale("it", "IT");
        Calendar calender = Calendar.getInstance();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
        System.out.println("Italia: " + dateInstance.format(calender.getTime()));
    }
}
