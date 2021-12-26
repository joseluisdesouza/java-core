package com.java.core.Npolimorfismo.test;

import com.java.core.Npolimorfismo.dominio.Computador;
import com.java.core.Npolimorfismo.dominio.PS5;
import com.java.core.Npolimorfismo.dominio.Produto;
import com.java.core.Npolimorfismo.dominio.Tomate;
import com.java.core.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 3 3200g, GTX 1650, SSD, 16GB RAM", 3500);


        Tomate tomate = new Tomate("Americano", 50);
        tomate.setDataValidade("25/12/2021");

        CalculadoraImposto.calcularImposto(tomate);

        CalculadoraImposto.calcularImposto(produto);
    }
}
