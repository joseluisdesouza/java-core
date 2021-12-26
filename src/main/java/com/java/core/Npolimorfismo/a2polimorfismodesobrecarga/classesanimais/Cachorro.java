package com.java.core.Npolimorfismo.a2polimorfismodesobrecarga.classesanimais;

public class Cachorro extends Lobo {

    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("au au au au au au au au");
    }

    public void reagir(String frase) {
        if (frase == "toma comida" || frase == "Ola") {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int horaMin) {
        if (horaMin < 12) {
            System.out.println("Abanar");
        } else if (horaMin >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, double peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        }
    }

}
