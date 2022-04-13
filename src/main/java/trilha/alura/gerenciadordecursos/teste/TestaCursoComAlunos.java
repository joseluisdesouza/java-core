package trilha.alura.gerenciadordecursos.teste;

import trilha.alura.gerenciadordecursos.Aluno;
import trilha.alura.gerenciadordecursos.Aula;
import trilha.alura.gerenciadordecursos.Curso;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunos {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 20));

        Aluno aluno1 = new Aluno("Rodrigo Turini", 5678);
        Aluno aluno2 = new Aluno("Guilerme Silveira", 6789);
        Aluno aluno3 = new Aluno("Mauricio Souza", 4531);

        javaColecoes.adicionaAluno(aluno1);
        javaColecoes.adicionaAluno(aluno2);
        javaColecoes.adicionaAluno(aluno3);

        //tipo for 1
        for (Aluno javaColecoesAluno : javaColecoes.getAlunos()) {
            System.out.println(javaColecoesAluno.getNome() + " " + javaColecoesAluno.getNumeroMatricula());
        }

        System.out.println("------------------------");

        //tipo for 2
        javaColecoes.getAlunos().stream().map(javaColecoesAluno -> javaColecoesAluno.getNome() + " " + javaColecoesAluno.getNumeroMatricula()).forEach(System.out::println);

        System.out.println("------------------------");

        //tipo for 3
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno.getNome());
            System.out.println(aluno.getNumeroMatricula());
        });

        System.out.println("------------------------");

        //sobre iterator, uma forma antiga de iterar sobre os objetos
        Set<Aluno> alunoSet = javaColecoes.getAlunos();
        Iterator<Aluno> proximo = alunoSet.iterator();
        while (proximo.hasNext()) {
            Aluno imprimindoAlunoDoIterator = proximo.next();
            System.out.println("Usando iterator -------- " + imprimindoAlunoDoIterator);
        }

        System.out.println("O aluno " + aluno1 + " esta matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(aluno1));
    }
}
