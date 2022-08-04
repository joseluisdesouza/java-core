package com.java.core.Rdatas;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(22, 33, 33));
        System.out.println(LocalTime.MAX.getHour());
        System.out.println(LocalTime.MAX.getMinute());
        System.out.println(LocalTime.MAX.getSecond());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
