package com.java.core.Qstring;

public class StringPerfomanceTest02 {
    public static void main(String[] args) {
        String nome = "Valentina";
        nome.concat(" Souza");
        //System.out.println(nome);
        StringBuilder stringBuilder = new StringBuilder("Valentina");
        System.out.println(stringBuilder.append(" Costa").append(" Palma"));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.delete(0, 3));
        //podemos alterar tudo para StringBuffer
    }
}
