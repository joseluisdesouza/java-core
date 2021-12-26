package com.java.core.Minterfaces.test;

import com.java.core.Minterfaces.dominio.DataBaseLoader;
import com.java.core.Minterfaces.dominio.DataLoader;
import com.java.core.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.remove();
        fileLoader.load();
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
    }
}
