package com.java.core.Isobrescrita.dominio;

public class Anime {
    private String nome;

    /**
     * Aqui esta acontecendo uma sobrescrita de metodo, esse metodo toString faz parte da classe Object e nesse momento estamos sobrescrevendo ele
     * o @Override nos força a deixar a assinatura do metodo exatamente igual ao que esta na classe object, sem ele se nos colocar outro nome ou tipo,
     * estaremos criando outro metodo e
     * isso não é o objetivo!
     *
     * A sobrescrita de métodos seria criar um novo método na classe filha contendo a mesma assinatura e mesmo tipo de retorno do método sobrescrito.
     * (Override). Ja o sobrecarga, ele no caso seria, o que permite métodos de mesmo nome, mas com suas assinaturas diferentes, ex argumentos diferentes.
     *
     */
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
