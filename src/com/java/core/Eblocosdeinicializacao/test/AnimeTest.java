package com.java.core.Eblocosdeinicializacao.test;

import com.java.core.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio);
        }

    }
}
