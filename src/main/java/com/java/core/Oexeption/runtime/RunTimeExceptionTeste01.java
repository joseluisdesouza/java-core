package com.java.core.Oexeption.runtime;

public class RunTimeExceptionTeste01 {
    public static void main(String[] args) {
        /**
         * Checked e Unchecked
         */

        //Unchecked tentando acessa um objeto que não existe
        Object object = null;
        System.out.println(object.toString());

    }
}
