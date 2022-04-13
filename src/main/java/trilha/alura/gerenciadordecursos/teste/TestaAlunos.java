package trilha.alura.gerenciadordecursos.teste;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        /**
         * Set é filha de Collections
         * Set não traz a lista ordenada
         * Set não deixa elementos serem duplicados
         * Set não é uma lista, então não podemos dar new em uma ArrayList
         * Set é um conjunto
         */
        alunos.add("Alberto Farias");
        alunos.add("Marcelo Farias");
        alunos.add("Paulo Brito");

        System.out.println(alunos);

        System.out.println("1-----------------------");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("2-----------------------");

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("3-----------------------");

        alunos.forEach(System.out::println);
    }
}
