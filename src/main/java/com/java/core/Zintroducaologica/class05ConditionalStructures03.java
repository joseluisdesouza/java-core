package com.java.core.Zintroducaologica;

public class class05ConditionalStructures03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 :)";
        String mensagemNãoDoar = "Eu não vou doar os 500 :(";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNãoDoar;
        }
        System.out.println(resultado);
        //doar se salario > 5000
        //(condicao) ? true : false
        String resultado1 = salario > 5 ? mensagemDoar : mensagemNãoDoar;
        //mesma validacao do if,else usando operador ternario, deve ser usado em um if,else simples
    }
}
