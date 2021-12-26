package com.java.core.Gassociacao.test;

import com.java.core.Gassociacao.dominio.Jogador;
import com.java.core.Gassociacao.dominio.Time;

public class TimeTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Zidane");
        Time time = new Time("França");

        Jogador[] jogadors = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadors);

        time.imprime();
        System.out.println("----------------");
        jogador.imprime();
    }
}
