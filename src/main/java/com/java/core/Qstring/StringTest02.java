package com.java.core.Qstring;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "       Valentina   ";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("V", "v"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.substring(0, 4));
        System.out.println(nome.trim()); //remove valores em branco do começo e fim
    }
}
