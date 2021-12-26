package trilha.alura.gerenciadordecursos;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelagem a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
            /**
             * Para cada String aula dentro de aulas faça o seguinte
             */
        }


        String primeiraAula = aulas.get(0);
        /**
         * Podemos pegar pelo indice, 0 é equivalente a primeira aula1
         */
        System.out.println("A primeira aula é " + primeiraAula);


        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i));
        }

        //----------------------------------------

        aulas.forEach(aula -> {
            System.out.println("percorendo: ");
            System.out.println("Aula: " + aula);
        });

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

//        aulas.forEach(aula -> {
//            System.out.println("percorendo: ");
//            System.out.println("Aula: " + aula);
//        });
//
//  Esses dois laçoes são muitos semelhantes para o de cima torna o codigo
//  mais enchuto e elegante.
//
//        for (String aula : aulas) {
//            System.out.println("Aula: " + aula);
//        }

        /**
         * Esse metodo sort vai ordenar os itens da lista
         */
        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
