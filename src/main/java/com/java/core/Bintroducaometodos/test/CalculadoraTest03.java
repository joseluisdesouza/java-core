package com.java.core.Bintroducaometodos.test;

import com.java.core.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divideDoisNumeros(20,2));
        System.out.println("*****************************");
        calculadora.divideDoisNumeros3(40,0);
    }
}
