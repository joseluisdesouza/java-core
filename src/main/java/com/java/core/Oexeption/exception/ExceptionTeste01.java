package com.java.core.Oexeption.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        file.createNewFile();
    }
}
