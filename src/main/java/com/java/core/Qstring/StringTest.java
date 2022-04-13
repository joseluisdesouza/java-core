package com.java.core.Qstring;

public class StringTest {
    public static void main(String[] args) {
        //String imutavel
        String name = "Valentina";
        String name2 = "Valentina";
        //para comparar a referencia de um objeto usamos ==
        System.out.println(name == name2);
        //e para comparar o valor usamos o equals
        System.out.println(name.equals(name2));
    }
}
