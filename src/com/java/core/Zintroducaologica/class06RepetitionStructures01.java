package com.java.core.Zintroducaologica;

public class class06RepetitionStructures01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0; //se for false essa condição ele não executa
        while (count < 10) {//retorna boleano
            System.out.println(++count);
        }
        count = 0;
        do {//executa pelo menos uma vez mesmo se a condiçaõ for false
            System.out.println("Dentro do do-while"+ ++count);
        }while (count <10);

        //for
        //3 partes
        for (int i=0;i<=2;i++) {
            System.out.println("no forrrrr");
        }
    }
}
