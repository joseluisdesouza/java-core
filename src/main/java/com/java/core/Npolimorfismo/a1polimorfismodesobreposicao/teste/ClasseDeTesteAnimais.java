package com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.teste;

import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classes.Ave;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classes.Mamifero;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classes.Peixe;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classes.Reptil;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classesanimais.Arara;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classesanimais.Cachorro;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classesanimais.Canguru;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classesanimais.Cobra;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classesanimais.Goldfish;
import com.java.core.Npolimorfismo.a1polimorfismodesobreposicao.classesanimais.Tartaruga;

public class ClasseDeTesteAnimais {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();

    }
}
