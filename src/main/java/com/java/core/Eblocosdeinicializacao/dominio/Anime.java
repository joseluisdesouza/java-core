package com.java.core.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    /**
     * -Criacao de objeto-
     * 1- Alocado espaco na memoria para o objeto
     * 2- Cada atributo é inicializado com valores default ou o quer for definido
     * 3- Bloco de inicializacao é executado
     * 4- O Construtor é executado
     */ {
        System.out.println("Dentro do bloco");
        /**bloco de inicialização é sempre executado todas as vezes em que criar
         uma instancia do objeto, pode estar em qualquer lugar da classe mas o ideal
         é sempre no inicio logo apos os atributos.
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

        for (int episodio : episodios) {
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
