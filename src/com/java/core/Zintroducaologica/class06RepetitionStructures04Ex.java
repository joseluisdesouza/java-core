package com.java.core.Zintroducaologica;

public class class06RepetitionStructures04Ex {
    public static void main(String[] args) {
        double valorTotal = 40000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }
    }
}
