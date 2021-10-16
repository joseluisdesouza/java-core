package com.java.core.Zintroducaologica;

public class class07Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[3];//forma 1
        //podemos inicializar o array com o tamanho e diretamente os valores
        int[] numeros1 = {1,2,3,4,5};//forma2
        //temos uma outra forma mas da na mesma
        int[] numeros2 = new int[]{1,2,3,4,5};//praticamente igual a 2
//        for (int i = 0; i < numeros1.length; i++) {
//            System.out.println(numeros1[i]);
//        }

        for (int num : numeros1) {
            System.out.println(num);
        }
    }
}
