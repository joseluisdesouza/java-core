package com.java.core.Jmodificadorfinal.teste;

import com.java.core.Jmodificadorfinal.dominio.Carro;
import com.java.core.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro = new Carro();
//        Comprador comprador = new Comprador();
//        carro.COMPRADOR = comprador;
//        carro.setNome("Camaro");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("DEV BACK");
        System.out.println(carro.COMPRADOR);
        carro.setNome("Skyline");
        carro.imprime();

        /**
         * variaveis do tipo final o que não se pode alterar é a referencia para o objeto
         */
    }
}
