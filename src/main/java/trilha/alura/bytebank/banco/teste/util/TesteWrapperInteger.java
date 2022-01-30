package trilha.alura.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        Integer integer = Integer.valueOf(35);
        System.out.println(integer.intValue());

        int idade1 = 25;
        Integer idadeRef = Integer.valueOf("25");
        System.out.println("Transforma um int para double " + idadeRef.doubleValue());

        String s = args[0];
        int numero = Integer.parseInt(s);
        System.out.println("Transforma de string para int, usando o valueOf ou parseInt " + numero);

        int idade = 27;
        List numeros = new ArrayList();

        /**
         * Lista guardam objetos referencias e não tipos primitivos, o que acontece
         * é que o java transforma esse int primitivo na classe Integer sendo assim
         * podendo guarda-lo
         *
         * Essa transformação se chama Autoboxing e ao contrario se chama
         * Unboxing
         */
        numeros.add(idade);

        //System.out.println(idade);

    }
}
