package com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classesanimais;

import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classes.Reptil;

public class Tartaruga extends Reptil {

    @Override
    public void locomover() {
        System.out.println("Andando beeeeeeemmm devagar");
    }
}
