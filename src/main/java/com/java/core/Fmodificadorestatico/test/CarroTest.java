package com.java.core.Fmodificadorestatico.test;

import com.java.core.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 140);
        Carro carro1 = new Carro("Camaro", 280);
        Carro carro2 = new Carro("Corvette", 310);
        //carro.setVelocidadeLimite(100);
        carro.imprime();
        carro1.imprime();
        carro2.imprime();
    }
}
