package com.java.core.Jmodificadorfinal.dominio;

public class Carro {
    /** ^
     * Podemos definir uma classe como final porem esta nunca podera sem
     * herdada, exemplo é a classe String que é final
     *
     * Podemos tambem ter metodos como final em uma classe que pode ser herdada
     * porem esse metodo na subclasse nunca podera ter seu comportamento alterado
     * linha 43 metodo final
     */

    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    /** ^
     * Aqui nesse codigo esta acontecendo que a referencia desse objeto
     * COMPRADOR nunca podera ser alterada
     */


    public static final double VELOCIDADE_LIMITE = 250;
    /** ^
     * sempre sera exigido um valor para inicializar, outra forma de inicializarmos é por um
     * bloco de inicialização ou construtor exemplo:
     *
     *      public Carro() {
     *          VELOCIDADE_LIMITE = 250
     *      }
     *
     *      static {
     *       VELOCIDADE_LIMITE = 250
     *      }
     *
     *      O bloco sempre sera executado no momento em que essa classe for carregada ira primeiro
     *      executar o bloco de inicialização
     *
     *      Veja mais sobre blocos de inicialização no pacote --Eblocosdeinicializacao--
     *
     * Constantes no java tem uma convenção, são sempre definidas com
     * letras maiusculas e separadas por anderline
     */


    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
