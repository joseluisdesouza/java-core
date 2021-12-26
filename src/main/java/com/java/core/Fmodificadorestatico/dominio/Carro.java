package com.java.core.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    /**
     * metodos estaticos pertencem a classe e não mais ao objeto criado
     * ao inves de chamar c1(objeto criado new e etc) c1.setSelocidadeMaxima(); e
     * passar outro valor, isso ir modificar o valor para todos os outros objetos
     * por que a tributo pertence a classe e não mais ao objeto
     * devemos chamar a classe dessa forma: Carro.velocidadeLimite(se ele fosse publico)
     *
     * Todos os objetos compartilham do mesmo valor
     *
     * Sobre metodos estaticos,
     * devemos usar somente quando o metodo não acessa uma variavel/atributo da instancia
     * @param nome
     * @param velocidadeMaxima
     */

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("*************************");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(this.velocidadeLimite);
    }

    //metodo static
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    //metodo static
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
