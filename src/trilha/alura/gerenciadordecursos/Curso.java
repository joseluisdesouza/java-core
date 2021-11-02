package trilha.alura.gerenciadordecursos;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    //HashSet não garante a orden do conjunto
    //O LinkedHashSet nos dá a performance de um HashSet mas com acesso previsível e ordenado.

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
        /**
         * Pegando o exemplo do curso, é como que se tivessemos outro conjunto de alunos
         * iguais, nada mudaria em relação referencia ou dados, ela simplesmente não seria
         * modificavel, nada de add ou remove!
         */
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
        //uma vez criada uma lista, é ela inmodificavel, não sera possivel add, remove e etc
        //e sera lançada uma exception
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                ", alunos=" + alunos +
                '}';
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);}

    public void adicionaAluno(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        return matriculaParaAluno.get(numero);
    }
}
