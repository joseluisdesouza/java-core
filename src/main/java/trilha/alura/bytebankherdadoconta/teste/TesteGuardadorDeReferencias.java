package trilha.alura.bytebankherdadoconta.teste;

import trilha.alura.bytebankherdadoconta.modelo.Conta;
import trilha.alura.bytebankherdadoconta.modelo.ContaCorrente;
import trilha.alura.bytebankherdadoconta.modelo.GuardadorDeContas;
import trilha.alura.bytebankherdadoconta.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {
    public static void main(String[] args) {
        /**
         * Isso tudo que foi mostrado seria a forma manual de fazer um add e querer saber a quantidade de
         * elementos (size) no pacote trilha.alura.bytebank.banco.teste.util na classe Teste
         * tem o mesmo caso de uso só que utilizando a classe util do java
         */
        GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

        Conta conta = new ContaCorrente(22,85);
        guardadorDeReferencias.adiciona(conta);

        Conta conta2 = new ContaCorrente(22,32);
        guardadorDeReferencias.adiciona(conta2);

        int tamanho = guardadorDeReferencias.getQuantidadeElementos();
        System.out.println("Imprimindo a quantidade de elementos: " + tamanho);

        Conta ref = (Conta) guardadorDeReferencias.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}
