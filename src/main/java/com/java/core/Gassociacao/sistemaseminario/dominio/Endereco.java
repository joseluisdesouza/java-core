package com.java.core.Gassociacao.sistemaseminario.dominio;

public class Endereco {
    private String rua;
    private String numeroCasa;
    private String cidade;

    public Endereco(String rua, String numeroCasa, String cidade) {
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
