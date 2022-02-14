package com.java.core.Oexeption.runtime;

public class RunTimeExceptionTeste02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    /**
     * Esta foi a primeira tratativa mas a questão é que sabemos que não existe divisão por zero
     * então vou comentar a forma que retorna zero e fazer uma tratativa se caso
     * um dos valores passados seja zero, e então removendo o try/catch
     */
    private static int divisao(int a, int b) {
        if(b == 0) {
            throw new RuntimeException("Argumento ilegal, não pode passar 0");
        }
        return a/b;
//        try {
//            return a / b;
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//        return 0;
    }
}
