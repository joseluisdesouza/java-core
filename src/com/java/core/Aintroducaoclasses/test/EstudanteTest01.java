package com.java.core.Aintroducaoclasses.test;

import com.java.core.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Maria";
        estudante.idade = 25;
        estudante.sexo = 'F';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
