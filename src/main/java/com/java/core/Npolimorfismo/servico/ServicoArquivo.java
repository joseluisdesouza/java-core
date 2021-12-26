package com.java.core.Npolimorfismo.servico;

import com.java.core.Npolimorfismo.repositorio.Repositorio;

public class ServicoArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no arquivo");
    }
}
