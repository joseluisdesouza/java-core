package com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classesanimais;

import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classes.Mamifero;

public class Canguru extends Mamifero {

    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}
