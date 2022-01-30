package trilha.alura.bytebank.banco.teste.util;

import trilha.alura.bytebankherdadoconta.modelo.Conta;
import trilha.alura.bytebankherdadoconta.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        //utilizando util
        ArrayList<Conta> arrayList = new ArrayList<>();

        Conta conta = new ContaCorrente(22,85);
        /**
         *Impossivel fazer isso pois o Array é do tipo Conta, se não tiver o tipo Conta como
         * generics dai seria possivel mas seria uma má pratica
         */
//        Cliente cliente = new Cliente("crefer", "wecwc");
//        arrayList.add(cliente);
        arrayList.add(conta);

        Conta conta2 = new ContaCorrente(22,32);
        arrayList.add(conta2);

        System.out.println("Tamanho atual: " + arrayList.size());

        Conta ref = arrayList.get(0);
        System.out.println(ref.getNumero());

        arrayList.remove(0);

        System.out.println("Tamanho depois de remover: " + arrayList.size());

        System.out.println("--------------------------------------------------------");

        Conta conta3 = new ContaCorrente(33,331);
        arrayList.add(conta3);

        Conta conta4 = new ContaCorrente(33,322);
        arrayList.add(conta4);

        for (int i = 0; i < arrayList.size(); i++) {
            Conta oRef = arrayList.get(i);
            System.out.println(("Imprimindo no for: " + oRef));
        }

        System.out.println("--OUTRO FOR--");

        for (Conta o : arrayList) {
            System.out.println("Com outro for temos o mesmo resultado: " + o);

        }

    }
}
