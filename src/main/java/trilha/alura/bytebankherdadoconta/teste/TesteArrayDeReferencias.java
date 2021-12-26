package trilha.alura.bytebankherdadoconta.teste;

import trilha.alura.bytebankherdadoconta.modelo.Cliente;
import trilha.alura.bytebankherdadoconta.modelo.Conta;
import trilha.alura.bytebankherdadoconta.modelo.ContaCorrente;

public class TesteArrayDeReferencias {
    public static void main(String[] args) {
        /**
         * Podemos deixar esse Array mais generico, ContaCorrente é filha de Conta que é abstrata
         *
         * Vou deixar aqui comentado o codigo antigo:
         *    ContaCorrente[] contaCorrentes = new ContaCorrente[5];
         */
        Conta[] contaCorrentes = new Conta[5];
        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        Cliente cliente = new Cliente("Pedro", "345435435345");
        contaCorrente.setTitular(cliente);

        contaCorrentes[0] = contaCorrente;
        contaCorrentes[1] = contaCorrente;
        contaCorrentes[2] = contaCorrente;
        contaCorrentes[3] = contaCorrente;
        contaCorrentes[4] = contaCorrente;

        /**
         * Agora não conseguimos ter essa referencia do tipo ContaCorrente
         * ContaCorrente ref = contaCorrentes[1];
         *
         * E sim do tipo mais generico que é Conta
         */
        Conta ref = contaCorrentes[1];

        System.out.println(ref.getNumero());

        for (Conta corrente : contaCorrentes) {
            System.out.println(corrente.getTitular().getNome());
        }
    }
}
