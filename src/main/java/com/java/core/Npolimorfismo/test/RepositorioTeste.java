package com.java.core.Npolimorfismo.test;

import com.java.core.Npolimorfismo.repositorio.Repositorio;
import com.java.core.Npolimorfismo.servico.ServicoArquivo;
import com.java.core.Npolimorfismo.servico.ServicoBancoDeDados;
import com.java.core.Npolimorfismo.servico.ServicoMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {

        Repositorio repositorio = new ServicoArquivo();
        repositorio.salvar();
    }
}
