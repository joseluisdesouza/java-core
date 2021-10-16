package com.java.core.Zintroducaologica;

public class class05ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 20;
        boolean isAuthority = age >= 18;
        // !
        if (isAuthority) {
            System.out.println("Dentro do if");
        }

        if (!isAuthority) { // mesma coisa que == false, se não for autorizado então...
            System.out.println("Não pode comprar bebida");
        }

        if (isAuthority) {
            System.out.println("Dentro do if");
        } else { // else é ignorado
            System.out.println("Fora");
        }

        boolean b = false;
        if (b == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora");
    }
}
