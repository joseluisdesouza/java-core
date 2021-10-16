package com.java.core.Csobrecargametodos.test;

import com.java.core.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Kengan Ashura", "TV", 20);
        anime.imprime();
    }
}
