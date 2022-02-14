package com.java.core.Oexeption.exception.dominio;

import com.java.core.Oexeption.exception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
