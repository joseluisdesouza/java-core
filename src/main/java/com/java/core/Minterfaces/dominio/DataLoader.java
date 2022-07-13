package com.java.core.Minterfaces.dominio;

/**
 * Uma interface é implementada(implements) e não estendida(extends)
 */
public interface DataLoader {
    /**
     * Uma interface pode ter atributos porem devem ser constantes
     */
    int MAX_DATA_SIZE = 10;

    /**
     * interfaces por padrão tem todos os metodos public abstract
     */
    void load();

    /**
     * Esse metodo é default por que sendo declarado desta forma não força que as classes
     * que implementaram essa interface sejam obrigadas a implementar ele.
     *
     * O por que disso é, imagine um sistema enorme e varias classes usam uma interface especifica
     * e alguem vai la e cria um novo metodo da forma da linha 10. bom, dai todas as 100 classes
     * quebrariam por não ter esse metodo implementado. Então é ai que o default entra, isso foi criado
     * pelo java na versão 8 por causa das versões e para não quebrar codigos antigos.
     * Dessa forma não somos obrigados a implementar, porem temos acesso a ele e se quisermos
     * podemos sobrescreve-lo para colocar nossa regra.
     *
     */
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissão");
    }

    /**
     * Podemos tambem ter metodos estaticos
     */
    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
