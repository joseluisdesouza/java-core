package com.java.core.Oexeption.runtime;

/**
 * BLOCO FINALLY
 */
public class RunTimeExceptionTeste03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            System.out.println("Fechando recurso liberado pelo SO");
        } catch (Exception e) {
            e.printStackTrace();
            /**
             * finally sempre sera executado
             */
        } finally {
            System.out.println("Finalizando");
        }

    }
}
