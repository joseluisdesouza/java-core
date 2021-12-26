package com.java.core.Npolimorfismo.servico;

import com.java.core.Npolimorfismo.repositorio.Repositorio;

public class ServicoMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
