package apostila.java.orientacao.objetos;

import java.util.Arrays;
import java.util.List;

public class Exercicios {
    public static void main(String[] args) {

        //        int i = 5;
//        int x = ++i;
//        System.out.println("NO X "+x);

        System.out.println("-----------------------------------");

        int x = 20;
        int y = 45;
        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei	um	número	divisível	por	19	entre	x	e	y " + i);
                break;
            }
        }

        System.out.println("-----------------------------------");
        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        //1. Imprima todos os números de 150 a 300.
        for (int numero = 150; numero <= 300; numero++) {
            System.out.println("Todos os números de 150 a 300 " + numero);
        }

        int i = 150;
        List<Integer> numbers = Arrays.asList(300);
        numbers.stream().filter(integer -> {
            return i <= 300;
        });
        System.out.println("###########################" + numbers);


        //2. Imprima a soma de 1 até 1000.

    }
}
