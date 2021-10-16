package trilha.alura.projetobancoalura;

public class CriaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("José", "897897897897");
        Conta conta = new Conta(500, 763, 1233232, cliente);

        Cliente cliente2 = new Cliente("Pamela", "35467687");
        Conta conta2 = new Conta(1000, 76333, 1323232, cliente2);

        System.out.println("--CONTA DESATUALIZADA--");
        System.out.println("");
        System.out.println("Titular: " + conta.getTitular().getNome() + " \nNumero: " +
                conta.getNumero() + " \nAgencia: " + conta.getAgencia() + " \nSaldo: "
                + conta.getSaldo());

        System.out.println("---------------------------------");
//        conta.deposita(1000);

        System.out.println("--CONTA ATUALIZADA APOS DEPOSITO--");
        System.out.println("");
        System.out.println("Titular: " + conta.getTitular().getNome() + " \nNumero: " +
                conta.getNumero() + " \nAgencia: " + conta.getAgencia() + " \nSaldo: "
                + conta.getSaldo());

        System.out.println("---------------------------------");
        conta.sacar(500);

        System.out.println("--CONTA ATUALIZADA APOS SAQUE--");
        System.out.println("");
        System.out.println("Titular: " + conta.getTitular().getNome() + " \nNumero: " +
                conta.getNumero() + " \nAgencia: " + conta.getAgencia() + " \nSaldo: "
                + conta.getSaldo());

        System.out.println("---------------------------------");
        conta2.transfere(500, conta);

        System.out.println("--CONTA ATUALIZADA DEPOIS DA TRANSFERENCIA--");
        System.out.println("");
        System.out.println("Titular: " + conta.getTitular().getNome() + " \nNumero: " +
                conta.getNumero() + " \nAgencia: " + conta.getAgencia() + " \nSaldo: "
                + conta.getSaldo());

        System.out.println("----------------------------------");
        System.out.println("Numero de contas totais: " + Conta.getTotal());
    }
}
