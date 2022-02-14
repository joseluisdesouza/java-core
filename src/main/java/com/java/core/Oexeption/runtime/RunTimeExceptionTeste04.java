package com.java.core.Oexeption.runtime;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * CAPTURANDO MULTIPLAS EXCEÇÕES
 */
public class RunTimeExceptionTeste04 {
    public static void main(String[] args) {
        /**
         * Excecoes mais genericas sempre no final
         */
        try {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("Dentro do NullPointerException");
        }

        /**
         * MULTI CATCH EM LINHA
         */

        try {
            talvezLance();
        } catch (SQLException | FileNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void talvezLance() throws SQLException, FileNotFoundException {

    }
}
