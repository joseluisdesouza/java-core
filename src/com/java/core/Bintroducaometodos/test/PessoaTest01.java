package com.java.core.Bintroducaometodos.test;

import com.java.core.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Goku");
        pessoa.setIdade(200);
        pessoa.imprime();
    }
}
