package com.java.core.Rdatas;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //Date já é legado
        //trabalha com um long de milisegundos
        //quase todos os metodos obsoletos
        Date date = new Date();
        System.out.println(date.getTime());

        Date date1 = new Date(1657759918103L);
        System.out.println(date1);
    }
}
