package com.java.core.Gassociacao.sistemaseminario.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprimeProfessor() {
        System.out.println("------Relatorio-------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios == null)
            return;
        System.out.println("------Seminarios cadastrados-------");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println("Endereço: cidade " + seminario.getEndereco().getCidade() + "Numero " + seminario.getEndereco().getNumeroCasa() + "Rua " + seminario.getEndereco().getRua());
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Chamando aluno sem os get______________________"+aluno); //vem somente a referencia Aluno@90f6bfd
                System.out.println("Aluno: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }
        }
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
