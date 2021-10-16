package trilha.alura.gerenciadordecursos;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do java",
                "Paulo Silveira");
        //criando um objeto curso sem as aulas

        System.out.println(javaColecoes);
        //aulas vira vazias pois não adicionamos elas ainda

        List<Aula> aulas = javaColecoes.getAulas();
        /**
         * criando uma lista de aulas dando referencia para o mesmo objeto curso
         * a referencia aulas aponta para a referencia javaColecoes que é referencia de Curso
         *
         * poderiamos ter feito isso em apenas uma linha:
         *  javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 20));
         */

//        aulas.add(new Aula("Trabalhando com ArrayList", 20));
//        aulas.add(new Aula("Trabalhando com ArrayList", 20));
//        aulas.add(new Aula("Trabalhando com ArrayList", 20));

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        /**
         * Não estamos nesse momento pedindo diretamente para adicionar uma lista atravez do
         * metodo add e passamos essa responsabilidade para o proprio objeto Curso atravez
         * de um metodo adiciona que recebe Aula
         */

        System.out.println(javaColecoes);
        //agora sim temos as aulas

        System.out.println(aulas.equals(javaColecoes.getAulas()));
        //teste para ver como o objeto é o mesmo deve dar true, pode usar tambem ==
//
//        System.out.println(aulas);
//
//        System.out.println(javaColecoes.getAulas());
    }
}
