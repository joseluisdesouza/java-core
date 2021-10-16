package com.java.core.Kenum.teste;

import com.java.core.Kenum.dominio.Cliente;
import com.java.core.Kenum.dominio.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Romario", TipoCliente.PESSOA_FISICA);
        Cliente cliente1 = new Cliente("Lukaku", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Messi", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Zapata", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        System.out.println("--------------------------");

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        /**
         * Cliente cliente = new Cliente("Romario", "PF");
         *         Cliente cliente1 = new Cliente("Lukaku", "PJ");
         *         Cliente cliente2 = new Cliente("Messi", "PESSOA_JURIDICA");
         *         Cliente cliente3 = new Cliente("Messi", "pessoa_Fisica");
         *
         * Isso é inconsistencia de dados, veja cada pessoa escreve da forma
         * que achar melhor definir PJ ou PF
         *
         * Vejamos algumas formas de resolver isso na classe principal
         */
    }
}
