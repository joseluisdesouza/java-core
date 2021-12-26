package com.java.core.Bintroducaometodos.test;

import com.java.core.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6);
        //utilizando o var args o java entende que se trata de um array
        //se tiver mais de um parametro, o varargs precisa ser o ultimo
    }
}
