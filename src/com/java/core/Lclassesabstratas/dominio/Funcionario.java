package com.java.core.Lclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calculaBonus();
    //cada classe prove de sua regra de bonus
    //metodos abstratos só existem dentro de classes abstratas

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//    @Override
//    public String toString() {
//        return "Funcionario{" +
//                "nome='" + nome + '\'' +
//                ", salario=" + salario +
//                '}';
//    }
}
