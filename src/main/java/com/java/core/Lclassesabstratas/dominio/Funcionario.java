package com.java.core.Lclassesabstratas.dominio;

/**
 * classes abstratas não podem ser instanciadas
 */
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    /**
     * cada classe prove de sua regra de bonus
     * metodos abstratos só existem dentro de classes abstratas
     */
    public abstract void calculaBonus();

    @Override
    public void imprime() {
        /**
         * implementei o metodo imprime da classe Pessoa, poderia tambem cada classe filha
         * de Funcionario implementar e ja definir sua propria regra de imprimir ou apenas
         * sobrescrever esse metodo e fazer sua regra mas lembre-se que se alguma classe
         * filha de Funcionario não sobrescrever esse metodo e for usar, tera a regra da classe
         * pai Funcionario.
         */
    }

    /**
     * esse metodo por mais que funcione para esse contexto não faria sentido, por que
     * todos as classes filhas que forem usar dele sem fazer a sobrescrita
     * o valor a ser calculado sera igual para todos, o certo é sobrescrever ele e que cada
     * classe filha implemente sua propria regra.
     *
     * Mas se todas as classes forem sobrescreve-lo porque temos esse calculo aqui na linha 30?
     * dessa forma o metodo acima esta certo, sendo ele abstrato!
     */
    public void calculaBonusErradoNesseContexto() {
        this.salario =  this.salario + this.salario * 0.1;
    }

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
}
