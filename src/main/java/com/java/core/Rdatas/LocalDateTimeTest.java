package com.java.core.Rdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        //uma juncao da LocalDate com a LocalTime
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-07-06");
        LocalTime time = LocalTime.parse("20:17:45");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        //aqui diz: quero essa data nesse horario
        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);
        //aqui diz: quero esse horario nessa data
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime2);
    }
}
