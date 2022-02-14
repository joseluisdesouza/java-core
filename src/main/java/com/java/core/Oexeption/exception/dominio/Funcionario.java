package com.java.core.Oexeption.exception.dominio;

import com.java.core.Oexeption.exception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        super.salvar();
    }
}
