package com.java.core.Zintroducaologica;

public class class08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[4];
        arrayInt[2] = new int[9];

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
        /**
         * vejamos, na linha 5 definimos um array multidimensional
         * que tera como base um array de 3 posições porem desta vez
         * não inicializamos ele direto como nos exemplos anteriores
         * deixamos para inicializar entre a linha 7 e 9 com o
         * seguinte contexto: na posição 0 do array base iremos ter
         * um array de 2 posições, na posição 1 do array base iremos ter
         * um array de 4 posição e na posição 2 iremos ter um array
         * de 9 posições. Array dentro de array!
         *
         * E para imprimir devemos usar dois for, por que?!
         * porque o primeiro for apenas ira iterar sobre o array base
         * e nos retornara apenas espaços de memoria, por isso
         * temos que usar mais um for para ele iterar sobre os arrays
         * internos.
         *
         * map = arraymulti
         */
    }
}
