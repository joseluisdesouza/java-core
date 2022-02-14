package com.java.core.Oexeption.exception;

/**
 * Excecao customizada
 *
 * Essa excecao é do tipo checked, nesse caso força o outro lado a fazer um tratamento
 *
 * Depois disso podemos sobrecarregar os construtores
 */
public class LoginInvalidoException extends Exception {

    //se ninguem customizar sua propria mensagem, esta sera a default
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
