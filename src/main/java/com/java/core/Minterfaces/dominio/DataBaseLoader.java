package com.java.core.Minterfaces.dominio;

/**
 * Não existe limite de interfaces em que podemos implementar, diferente de herança em que não
 * podemos ter multiplas heranças
 */
public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Nova checagem de permissão sobrescrita");
    }


}
