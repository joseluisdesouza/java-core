package com.java.core.Npolimorfismo.test;

import com.java.core.Npolimorfismo.dominio.Computador;
import com.java.core.Npolimorfismo.dominio.PS5;
import com.java.core.Npolimorfismo.dominio.Tomate;
import com.java.core.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MACPRO", 8.000);
        Tomate tomate = new Tomate("Tomateiro", 10);
        PS5 videogame = new PS5("Playstation5", 5.000);
        /**
         * Não é necessario criar esse objeto se colocarmos esses metodos estaticos,
         * dai a chamada ficaria assim:
         * CalculadoraImposto.calcularImpostoComputador(computador);
         *
         * ""se voce não estiver acessando nenhum atributo de classe, voce pode
         * transformar seus metodos em estaticos""
         */

        /**
         * Outro ponto é que podemos criar os objetos sem a referencia, isso se caso
         * não fomos usar ela e então podemos fazer dessa forma
         *      CalculadoraImposto.calcularImposto(new Computador("MACPRO", 8.000));
         *      System.out.println("---------------------------------------------");
         *      CalculadoraImposto.calcularImposto(new Tomate("Tomateiro", 10));
         */
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(videogame);

    }
}
