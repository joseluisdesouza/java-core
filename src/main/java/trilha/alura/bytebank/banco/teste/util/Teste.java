package trilha.alura.bytebank.banco.teste.util;

import trilha.alura.bytebankherdadoconta.modelo.Cliente;
import trilha.alura.bytebankherdadoconta.modelo.Conta;
import trilha.alura.bytebankherdadoconta.modelo.ContaCorrente;
import trilha.alura.bytebankherdadoconta.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Vamos simplificar essa classe
 */
class TesteOrdenacao2 {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        TitularDaContaComparator2 titularDaContaComparator2 = new TitularDaContaComparator2();
        NumeroDaContaComparator2 numeroDaContaComparator2 = new NumeroDaContaComparator2();
        /**
         * Usando classes anonimas, perceba que devemos passar o () construtor
         */
        lista.sort(new Comparator<Conta>() {

            @Override
            public int compare(Conta c1, Conta c2) {
                int c1Numero = c1.getNumero();
                int c2Numero = c2.getNumero();
                return Integer.compare(c1Numero, c2Numero);
            }
        });

        for (Conta conta : lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
    }
}

/**
 * Nessa melhoria vamos falar sobre classes anonimas, perceba que criamos essa classe
 * que contem apenas um unico metodo, e la encima fazemos a instancia dela para poder usar/
 * emcapsular mas isso fica muito trabalhoso, criar uma classe para apenas um metodo e esta classe
 * não contem atributos tambem e é ai que entra a classe anonima, a mudança estara no list.sort();
 */
class NumeroDaContaComparator2 implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        int c1Numero = c1.getNumero();
        int c2Numero = c2.getNumero();
        return Integer.compare(c1Numero, c2Numero);

    }
}

class TitularDaContaComparator2 implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }

}
