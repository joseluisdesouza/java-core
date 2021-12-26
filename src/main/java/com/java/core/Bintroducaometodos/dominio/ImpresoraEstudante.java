package com.java.core.Bintroducaometodos.dominio;

public class ImpresoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("Nome: " + estudante.nome + "\nidade: " +
                estudante.idade + "\nsexo: " + estudante.sexo);
    }
}
