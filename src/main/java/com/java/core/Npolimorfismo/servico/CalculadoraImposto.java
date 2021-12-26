package com.java.core.Npolimorfismo.servico;

import com.java.core.Npolimorfismo.dominio.Computador;
import com.java.core.Npolimorfismo.dominio.Produto;
import com.java.core.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    /**
     * perceba que tinhamos dois metodos praticamente iguais, então fiz um metodo
     * que recebe um tipo mais generico
     *
     */
//    public void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatorio de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador " + computador.getNome());
//        System.out.println("Valor " + computador.getValor());
//        System.out.println("Imposto a ser cobrado " + imposto);
//    }
//
//    public void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatorio de imposto do Tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate " + tomate.getNome());
//        System.out.println("Valor " + tomate.getValor());
//        System.out.println("Imposto a ser cobrado " + imposto);
//    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        System.out.println("------------------------------------------------");

        if (produto instanceof Tomate) {
            /**
             * Uma outra forma de fazer cast
             *
             * if (produto instanceof Tomate) {
             *     System.out.println(((Tomate) produto).getDataValidade());
             * }
             *
             * ou
             *
             *  String dataValidade = ((Tomate) produto).getDataValidade();
             *  e usa a referencia.
             */
            Tomate tomate = (Tomate) produto;
            System.out.println("Passando por aqui na instancia de tomate");
            System.out.println(tomate.getDataValidade());
        }
    }
}
