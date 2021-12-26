package com.java.core.Npolimorfismo.servico;

import com.java.core.Npolimorfismo.repositorio.Repositorio;

public class ServicoBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
