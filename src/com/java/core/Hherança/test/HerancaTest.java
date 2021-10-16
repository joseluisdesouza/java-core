package com.java.core.Hherança.test;

import com.java.core.Hherança.dominio.Endereco;
import com.java.core.Hherança.dominio.Funcionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HerancaTest {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua brasil");
        endereco.setBairro("Vila boa ");

        Funcionario funcionario = new Funcionario("José", "021-5252-5454", endereco, 5000);

        funcionario.imprime();

        /**
         * protected faz com que o atributo seja acessado diretamente por qualquer classe que esteja no mesmo pacote ou classes que tenham sido herdadas pela classe
         * que tenha os atributos protegidos
         */

    }
}
