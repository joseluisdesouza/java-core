package com.java.core.Zintroducaologica;

public class class04Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int sum = number01 + number02;
        int subtraction = number01 - number02;
        int multiplication = number01 * number02;
        //sinal de + não é sobrecarregado aqui então ele entende como concatenação
        System.out.println("Valor " + number01 + number02);
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        /* operadores logicos
        < > <= >= == !=
        &&(AND) ||(OR) !(NOT)
        */
         boolean isDezMaiorQueVinte = 10 > 20;
         boolean isDezMenorQueVinte = 10 < 20;
         boolean isDezIgualQueVinte = 10 == 20;
         boolean isDezDiferenteQueVinte = 10 != 20;
         int idade = 35;
         float salario = 3500F;
         boolean isDentroDaLei = idade > 30 && salario >4612;
        System.out.println(isDentroDaLei);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);

        double valorTotalContaCorrente = 6000;
        double valorTotalContaPoupanca = 200;
        float valorPS5 = 5000F;
        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupanca > valorPS5;
        System.out.println("PS5 vai ou não vai? " + isPS5Compravel);
        if (isPS5Compravel == false) {
            System.out.println("Dessa vez não deu, fica para proxima!");
        } else
            System.out.println("Conseguimos, bora jogar essa bagaça!");

        //  = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus++;
        System.out.println(bonus);
    }
}
