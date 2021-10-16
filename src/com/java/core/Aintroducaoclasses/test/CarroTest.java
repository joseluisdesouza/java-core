package com.java.core.Aintroducaoclasses.test;

import com.java.core.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "913gt3";
        carro.modelo = "porche";
        carro.ano = 2015;

        System.out.println("Nome: " + carro.nome + "\nmodelo: " +
                carro.modelo + "\nano: " + carro.ano);

        System.out.println("***********************");

        carro1.nome = "Aventador";
        carro1.modelo = "lamborghini";
        carro1.ano = 2011;

        System.out.println("Nome: " + carro1.nome + "\nmodelo: " +
                carro1.modelo + "\nano: " + carro1.ano);

    }
}
