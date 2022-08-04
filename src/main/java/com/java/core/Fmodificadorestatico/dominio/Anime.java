package com.java.core.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    /**
     * -Criacao de objeto-
     * 1- Alocado espaco na memoria para o objeto
     * 2- Cada atributo é inicializado com valores default ou o quer for definido
     * 3- Bloco de inicializacao é executado
     * 4- O Construtor é executado
     */

    /**
     * -Criacao de objeto e msobre bloco de inicialização estatico da aula 63-
     * 0 - Antes mesmo de ser alocado esaco na memoria o bloco estatico é rodado uma vez
     * 1- Alocado espaco na memoria para o objeto
     * 2- Cada atributo é inicializado com valores default ou o quer for definido
     * 3- Bloco de inicializacao é executado
     * 4- O Construtor é executado
     */

    //basta apenas definirmos static na frente
    static {
        System.out.println("Dentro do bloco de inicialização");
        /**
         * bloco de inicialização é sempre executado todas as vezes em que criar
         * uma instancia do objeto, pode estar em qualquer lugar da classe mas o ideal
         * é sempre no inicio logo apos os atributos
         */
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
