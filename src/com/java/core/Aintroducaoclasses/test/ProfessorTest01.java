package com.java.core.Aintroducaoclasses.test;

import com.java.core.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Goku";
        professor.idade = 50;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + "\nidade: " +
                professor.idade + "\nsexo: " + professor.sexo);
    }
}
