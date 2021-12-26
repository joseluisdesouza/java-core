package trilha.alura.gerenciadordecursos;

/**
 * A interface Map mapeia valores para chaves, ou seja, através da chave conseguimos acessar o valor
 *
 * Ela funciona da seguinte maneira, mapeia valores para chaves, e através da chave conseguimos acessar o valor correspondente.
 * Por isso ela não pode ser repetida, ao contrário do valor, que podem existir iguais.
 *
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------
 *
 * Se repetimos uma chave, a chave repetida é sobrescrita pela nova
 *
 * Se uma chave for repetida, a antiga permanece, porém, o valor é sobrescrito pelo novo valor contido na chave passada, sendo o antigo valor "esquecido" pelo Map.
 *
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------
 *
 * Qual método utilizamos para adicionar um elemento em um Map?
 *
 * --put--
 *
 * O método utilizado para adicionar um elemento em um Map é o método put.
 * Ele recebe dois parâmetros, a chave e o valor. Os tipos desses parâmetros dependem do que definimos na hora da instância do objeto.
 * Por exemplo, abaixo criamos um Map que recebe como chave a matrícula do aluno e como valor o seu nome:
 *
 * Map<Integer, String> matriculaParaAluno = new HashMap<>();
 * matriculaParaAluno.put(123456, "Leonardo Cordeiro");COPIAR CÓDIGO
 * Então no put, nós temos que receber como parâmetro um inteiro, que representa a matrícula, e uma String, que representa o nome do aluno.
 *
 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------
 *
 * LinkedHashMap
 *
 * O LinkedHashMap continua nos dando a performance de um HashMap, mas com acesso previsível e ordenado, seguindo a inserção dos seus elementos.
 */

public class TestaBuscaAlunosNoCursoComMap {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 5617));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 20));

        Aluno aluno1 = new Aluno("Rodrigo Turini", 5678);
        Aluno aluno2 = new Aluno("Guilerme Silveira", 5617);
        Aluno aluno3 = new Aluno("Mauricio Souza", 4531);

        javaColecoes.adicionaAluno(aluno1);
        javaColecoes.adicionaAluno(aluno2);
        javaColecoes.adicionaAluno(aluno3);

        System.out.println("Quem é o aluno com matricula 5617?");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("aluno : " + aluno);

    }
}
