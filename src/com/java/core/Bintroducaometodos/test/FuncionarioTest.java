package com.java.core.Bintroducaometodos.test;

import com.java.core.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprimir();
    }
}
