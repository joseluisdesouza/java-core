package com.java.core.Oexeption.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {
    /**
     * Não posso colocar na assinatura desse main que ele é possivel de lançar
     * a exception IOException pois ele é o ultimo da aplicação e não mandara para
     * nenhum outro, o que devo fazer é um try/catch
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
            throw e; //para relançar a exceção porem ele exige a assinatura
        }
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
