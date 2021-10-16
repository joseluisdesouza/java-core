package com.java.core.Gassociacao.sistemaseminario.test;

import com.java.core.Gassociacao.sistemaseminario.dominio.Aluno;
import com.java.core.Gassociacao.sistemaseminario.dominio.Endereco;
import com.java.core.Gassociacao.sistemaseminario.dominio.Professor;
import com.java.core.Gassociacao.sistemaseminario.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Paraiba", "563", "Porto Alegre");

        Professor professor = new Professor("Pedro", "Matematica");

        Aluno aluno = new Aluno("João", 25);

        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Seminario de tecnologia e informação", alunos, endereco);

        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprimeProfessor();
    }
}
