package trilha.alura.gerenciadordecursos.teste;

import trilha.alura.gerenciadordecursos.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Lista de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        /**
         *Ordene as aulas comparando o tempo das aulas linha 24
         */

        System.out.println(aulas);

        aulas.sort(Aula::compareTo);
        /**
         * Mesma coisa da linha 24 só que menor
         */

        System.out.println(aulas);
    }
}
