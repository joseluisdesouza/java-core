package com.java.core.Oexeption.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    /**
     * Estamos fazendo o tratamento do metodo createNewFile por que ele é possivel
     * de lançar uma throws IOException que é uma exceção do tipo checked, ela acontece
     * em tempo de compilação então se torna obrigatorio o tratamento dela.
     *
     * As boa praticas dizem que devemos oferecer um tratamento mais especifico para as
     * exceptions ou seja, ao invés de colocarmos Exception por ser mais generica devemos
     * colocar a exception especifica que ira oferecer um tratamento melhor
     * @throws IOException
     */
    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        file.createNewFile();
    }
}
