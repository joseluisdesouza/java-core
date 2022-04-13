package com.java.core.Ycolecoes.teste;

import com.java.core.Ycolecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("728346578346473", "iphone");
        Smartphone smartphone2 = new Smartphone("728346578346473", "iphone");
        System.out.println(smartphone.equals(smartphone2));
    }
}
