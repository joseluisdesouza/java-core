package com.java.core.Zintroducaologica;

public class class05ConditionalStructures04Ex {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double valorImposto;
        if (salarioAnual <= 34.712) {
            valorImposto = salarioAnual * 9.70 / 100;
        } else if (salarioAnual >= 34.35 && salarioAnual <= 68.712) {
            valorImposto = salarioAnual * 37.35 / 100;
        } else {
            valorImposto = salarioAnual * 49.50 / 100;
        }
        System.out.println(valorImposto);
    }
}
