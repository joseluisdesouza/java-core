package com.java.core.Gassociacao.test;

import com.java.core.Gassociacao.dominio.Jogador;
import com.java.core.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        //associacao unidirecional
        Jogador jogador = new Jogador("Morata");
        Time time = new Time("Real");
        jogador.setTime(time);
        jogador.imprime();
       // Time time =
    }
}
