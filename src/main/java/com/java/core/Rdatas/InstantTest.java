package com.java.core.Rdatas;

import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
    }
}
