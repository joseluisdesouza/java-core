package trilha.alura.bytebank.banco.teste.util;

import trilha.alura.bytebankherdadoconta.modelo.Conta;
import trilha.alura.bytebankherdadoconta.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

public class TesteArrayListEquals {
    public static void main(String[] args) {

//        Conta CC1 = new ContaCorrente(22, 22);
//        Conta CC2 = new ContaCorrente(22, 22);
//
//        boolean ehIgual = CC1.ehIgual(CC2);
//        System.out.println("É igual ? " + ehIgual);


        //Generics
        List<Conta> lista = new ArrayList<>();
        Collection<Conta> lista1 = new ArrayList<>();
        List<Conta> lista2 = new LinkedList<>();
        List<Conta> lista3 = new Vector<>();

        Conta cc = new ContaCorrente(22, 85);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 32);
        lista.add(cc2);

        System.out.println("-------------------------------------");

        /**
         * Perguntamos para a lista se contains o objeto cc2
         */

        System.out.println("--Testando o equals!--");

        Conta cc3 = new ContaCorrente(22, 32);
        /**
         * O metodo contains chama internamente o metodo equals e por isso agora depois
         * que sobrescrevemos o equals na classe Conta, ele ira validar da forma correta ou seja,
         * ao invez de verificar igualdade de referencias ele ira verificar os valores dos
         * objetos (isso dependendo da forma de como foi implementado o metodo equals na classe
         * principal).
         */
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe ? " + existe);


        System.out.println("-------------FIM DO TESTA EQUALS------------");

        for (Conta conta2 : lista) {
            System.out.println(conta2);
        }
    }
}
