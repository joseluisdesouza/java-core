package com.java.core.Sformatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
