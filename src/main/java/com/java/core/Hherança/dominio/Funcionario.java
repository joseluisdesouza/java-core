package com.java.core.Hherança.dominio;

public class Funcionario extends Pessoa {
    /**
     * Funcionario herdou de Pessoa nome, cpf e endereco, assim tendo um forte acoplamento
     * <p>
     * Herança é um, Associação tem um!
     */

    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
