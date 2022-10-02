package com.java.core.Kenum.dominio;

public class Cliente {
    /**
     * OBS: Podemos criar uma classe enum dentro desta classe ex:
     * <p>
     * public enum TipoPagamento {
     * DEBITO, CREDITO
     * }
     */
    private String nome;
    //private String tipo;
    private TipoCliente tipoCliente;

    //public static final String PESSOA_FISICA = "PESSOA_FISICA";
    //public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    /** ^
     * 1 Primeira opção é termos atributos final que representa que seram imutaveis e;
     * static que representa que esse atributo pertence a classe e não ao objeto,
     * significa que qualquer objeto que for instanciado a partir desta classe tera o mesmo
     * comfalseportamento do PF E PJ igual para todos
     */

    //public Cliente(String nome, String tipo) {
    //if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
    //    return;
    //}
    //this.nome = nome;
    //this.tipo = tipo;


    /**
     * 2 validação no construtor porem isso é forçar a criação de um cliente PF ou PJ
     * a solução real para esse problema é o ENUM
     */
    //}
    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente " +
                "nome: " + nome +
                ", tipo: " + tipoCliente +
                ", tipoInt: " + tipoCliente.getValor() +
                ", tipoRelatorio: " + tipoCliente.getNomeRelatorio();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
