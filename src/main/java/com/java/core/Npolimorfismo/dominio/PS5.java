package com.java.core.Npolimorfismo.dominio;

public class PS5 extends Produto{

    private static final double IMPOSTO_POR_CENTO = 0.21;

    public PS5(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do PS5");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
