package com.java.core.Gassociacao.sistemaseminario.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Endereco endereco;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Endereco endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public Seminario(String titulo, Aluno[] alunos, Endereco endereco) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.endereco = endereco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
