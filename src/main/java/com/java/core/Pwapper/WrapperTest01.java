package com.java.core.Pwapper;

public class WrapperTest01 {
    public static void main(String[] args) {
        //encapsular os tipos primitivos e transformar em objetos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean booP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100.5;
        Character charW = 'W';
        Boolean booW = false;

        Integer iii2 =  Integer.parseInt("15");
        System.out.println(iii2);

        System.out.println(Character.isDigit('4'));

    }
}
