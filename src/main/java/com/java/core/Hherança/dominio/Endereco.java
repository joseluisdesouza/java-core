package com.java.core.Hherança.dominio;

public class Endereco {
    private String rua;
    private String bairro;

    /**
     * Endereco não tera varias pessoas, fazendo o uso de um array por exemplo, pois imagine se quisessemos usar essa classe em outras classes,
     * é inviavel.
     */

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
