package com.java.core.Gassociacao.test;

import com.java.core.Gassociacao.dominio.Escola;
import com.java.core.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Devdojo");
        Professor[] professoresArray = {professor};
        Escola escola = new Escola("Academy", professoresArray);
        escola.imprime();
    }
}
