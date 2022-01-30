package trilha.alura.bytebankherdadoconta.teste;

import trilha.alura.bytebankherdadoconta.modelo.Conta;
import trilha.alura.bytebankherdadoconta.modelo.ContaCorrente;
import trilha.alura.bytebankherdadoconta.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {
        /**
         * Isso tudo que foi mostrado seria a forma manual de fazer um add e querer saber a quantidade de
         * elementos (size) no pacote trilha.alura.bytebank.banco.teste.util na classe Teste
         * tem o mesmo caso de uso só que utilizando a classe util do java
         */
        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

        Conta conta = new ContaCorrente(22,85);
        guardadorDeContas.adiciona(conta);

        Conta conta2 = new ContaCorrente(22,32);
        guardadorDeContas.adiciona(conta2);

        int tamanho = guardadorDeContas.getQuantidadeElementos();
        System.out.println("Imprimindo a quantidade de elementos: " + tamanho);

        Conta ref = guardadorDeContas.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
