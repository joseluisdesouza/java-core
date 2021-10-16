package com.java.core.Zintroducaologica;

public class class05ConditionalStructures02 {
    public static void main(String[] args) {
        //regra: toda variavel de escopo local sempre deve ser inicializada
        var age = 20;
        if (age < 15) {
            System.out.println("Categoria infantil");
        } else if (age >= 15 && age < 18) {
            System.out.println("Categoria infantil");
        } else {// se não, qualquer outro resultado sera adulto
            System.out.println("Adulto");
        }

        String categoria;
        if (age < 15) {
            categoria = ("Categoria infantil");
        } else if (age >= 15 && age < 18) {
            categoria = ("Categoria infantil");
        } else {// se não, qualquer outro resultado sera adulto
            categoria = ("Adulto");
        }
        System.out.println(categoria); //forma mais linda de se fazer
    }
}
