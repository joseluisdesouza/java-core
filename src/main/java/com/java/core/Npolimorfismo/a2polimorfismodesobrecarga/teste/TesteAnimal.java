package com.java.core.Npolimorfismo.a2polimorfismodesobrecarga.teste;

import com.java.core.Npolimorfismo.a2polimorfismodesobrecarga.classesanimais.Cachorro;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.reagir("Ola");
        cachorro.reagir("Vai apanhar");

        cachorro.reagir(false);
    }
}
