package com.java.core.Zintroducaologica;

public class class07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double iniciam com 0
        //char '\u0000' ''
        //String null
        int[] idades = new int[3];
        System.out.println("Dentro do espaço de memoria 0 do array: " + idades[0]);
        System.out.println("Dentro do espaço de memoria 1 do array: " + idades[1]);
        System.out.println("Dentro do espaço de memoria 2 do array: " + idades[2]);

        System.out.println("----------------------------------------------------");

        boolean[] idades1 = new boolean[3];
        System.out.println("Dentro do espaço de memoria 0 do array: " + idades1[0]);
        System.out.println("Dentro do espaço de memoria 1 do array: " + idades1[1]);
        System.out.println("Dentro do espaço de memoria 2 do array: " + idades1[2]);

        System.out.println("----------------------------------------------------");

        float[] idades2 = new float[3];
        System.out.println("Dentro do espaço de memoria 0 do array: " + idades2[0]);
        System.out.println("Dentro do espaço de memoria 1 do array: " + idades2[1]);
        System.out.println("Dentro do espaço de memoria 2 do array: " + idades2[2]);

        System.out.println("----------------------------------------------------");

        String[] idades3 = new String[3];
        System.out.println("Dentro do espaço de memoria 0 do array: " + idades3[0]);
        System.out.println("Dentro do espaço de memoria 1 do array: " + idades3[1]);
        System.out.println("Dentro do espaço de memoria 2 do array: " + idades3[2]);
    }
}
