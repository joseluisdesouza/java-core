package com.java.core.Aintroducaoclasses.test;

import com.java.core.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro2.nome = "913gt3";
        carro2.modelo = "porche";
        carro2.ano = 2015;

        System.out.println("Nome: " + carro2.nome + "\nmodelo: " +
                carro2.modelo + "\nano: " + carro2.ano);

        System.out.println("***********************");

        carro2.nome = "Aventador";
        carro2.modelo = "lamborghini";
        carro2.ano = 2011;

        System.out.println("Nome: " + carro2.nome + "\nmodelo: " +
                carro2.modelo + "\nano: " + carro2.ano);

    }
}
