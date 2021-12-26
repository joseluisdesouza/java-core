package com.java.core.Bintroducaometodos.test;

import com.java.core.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Maria";
        estudante01.idade = 25;
        estudante01.sexo = 'F';
        estudante01.imprime();

        System.out.println("*******************************");

        estudante02.nome = "Pedro";
        estudante02.idade = 25;
        estudante02.sexo = 'M';
        estudante02.imprime();
    }
}
