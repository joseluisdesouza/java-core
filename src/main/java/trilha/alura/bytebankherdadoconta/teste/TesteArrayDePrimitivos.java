package trilha.alura.bytebankherdadoconta.teste;

import java.util.Arrays;

public class TesteArrayDePrimitivos {
    //Array String[]
    public static void main(String[] args) {

        /**
         * sem usar array, imagina quantas linhas teriamos que
         * definir para 500 idades
         *
         * int idade = 27;
         * int idade1 = 45;
         * int idade2 = 32;
         * int idade3 = 56;
         * int idade4 = 23;
         * int idade5 = 21;
         */

        //um array tambem é um objeto e por isso deve ser criado(instanciado)
        int[] idades = new int[5];

        idades[0] = 27;
        idades[1] = 5;
        idades[2] = 21;
        idades[3] = 44;
        idades[4] = 23;

        for (int idade : idades) {
            System.out.println(idade);
        }

        System.out.println(idades.length);
    }
}
