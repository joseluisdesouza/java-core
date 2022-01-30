package trilha.alura.bytebank.banco.teste.util;

import trilha.alura.bytebankherdadoconta.modelo.Cliente;
import trilha.alura.bytebankherdadoconta.modelo.Conta;
import trilha.alura.bytebankherdadoconta.modelo.ContaCorrente;
import trilha.alura.bytebankherdadoconta.modelo.ContaPoupanca;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacao {
    public static void main(String[] args) {

//        Conta cc1 = new ContaCorrente(22, 33);
//        cc1.deposita(333.0);
//
//        Conta cc2 = new ContaPoupanca(22, 44);
//        cc2.deposita(444.0);
//
//        Conta cc3 = new ContaCorrente(22, 11);
//        cc3.deposita(111.0);
//
//        Conta cc4 = new ContaPoupanca(22, 22);
//        cc4.deposita(222.0);

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

        System.out.println("----------------INICIANDO OS FOR E COMPARATOR-------------");

        System.out.println("SEM ORDENAÇÃO");
        for (Conta conta : lista) {
            System.out.println(conta.getTitular().getNome());
        }

        System.out.println("--------------------------------");

        System.out.println("COM ORDENAÇÃO");
        /**
         * Normalmente não vemos codigo assim, ou seja, essa referencia do objeto é usada apenas uma vez
         * então vamos cria-lo diretamente sem o uso de uma referencia
         * FORMA DE COMO ESTAVA ANTES
         * NumeroDaContaComparator contaComparator = new NumeroDaContaComparator();
         * TitularDaContaComparator titularDaContaComparator = new TitularDaContaComparator();
         *
         */
//        NumeroDaContaComparator contaComparator = new NumeroDaContaComparator();
//        TitularDaContaComparator titularDaContaComparator = new TitularDaContaComparator();

        /**
         * troque os comparator, um por numero da conta e o outro por nome do titular
         *
         * Se quiser usar a ordem natural nesse sort não passando nenhum comparetor, pela doc
         * diz que devemos passar sort(null);
         *
         * java.util.Comparator
         * Correto, o comparator é um parâmetro do método sort da lista e da classe Collections.
         *
         * java.lang.Comparable
         * Correto, para definir a ordem natural dos elementos!
         */
        lista.sort(new TitularDaContaComparator());
        //lista.sort(new NumeroDaContaComparator());

        System.out.println("-----------------------------------------");

        System.out.println("NO SHUFFLE, embaralha a lista");
        Collections.shuffle(lista);
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        System.out.println("FIM DO SHUFFLE");

        System.out.println("----------------------------------------");


        System.out.println("-----------------------------------------");
        System.out.println("NO NOVO SORT USANDO COMPARETO");
        Collections.sort(lista);
        for (Conta conta : lista) {
            System.out.println(conta.getSaldo());
        }
        System.out.println("FIM DO NOVO COMPARETOR");
        System.out.println("-----------------------------------------");

        lista.stream().forEach(conta -> System.out.println(conta.getTitular().getNome()));
    }
}

class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();

        return nomeC1.compareTo(nomeC2);
        //return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
    }
}

class NumeroDaContaComparator implements java.util.Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        int c1Numero = c1.getNumero();
        int c2Numero = c2.getNumero();

        return Integer.compare(c1Numero, c2Numero);

        //return c1.getNumero() - c2.getNumero();

//        if (c1.getNumero() < c2.getNumero()) {
//            return -1;
//        }
//
//        if (c1.getNumero() > c2.getNumero()) {
//            return 1;
//        }
//        return 0;
    }
}
