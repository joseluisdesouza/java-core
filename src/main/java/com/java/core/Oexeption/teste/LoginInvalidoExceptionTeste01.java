package com.java.core.Oexeption.teste;

import com.java.core.Oexeption.exception.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String userNameDB = "Goku";
        String senhaDB = "123";

        System.out.println("Usuario");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha");
        String senhaDigitada = scanner.nextLine();
        if (!userNameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }

        System.out.println("Usuario logado com sucesso");
    }

}
