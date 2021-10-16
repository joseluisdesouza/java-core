package com.java.core.Gassociacao.test;

import com.java.core.Gassociacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("CR7");
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Zapata");
        Jogador[] jogadores = {jogador, jogador1, jogador2};
        System.out.println(jogador.getNome() + " sem o for");
        for (Jogador jogadoress: jogadores) {
            System.out.println(jogadoress.getNome());
        }

        /**
         * Tres formas de criar um array com objetos:
         *
         * Jogador[] = new Jogador[3];
         * Jogador[] = new Jogador[]{jogador, jogador1, jogador3};
         * Jogador[] = {jogador, jogador1, jogador3};
         */

    }
}
