package trilha.alura.projetobancoalura;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        Conta.total++;
        System.out.println("Total de contas é " + Conta.total);
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void deposita(double valor) {
        System.out.println("Esta depositando " + valor);
        this.saldo += valor;
        System.out.println("Sua conta ficou com esse valor " + this.saldo);
    }

    public boolean sacar(double valorSacar) {
        System.out.println("Esta sacando " + valorSacar);
        if (this.saldo >= valorSacar) {
            this.saldo -= valorSacar;
            System.out.println("Saldo atual ficou: " + this.saldo);
            return true;
        } else
            System.out.println("Impossivel sacar pois não possui valor usuficiente");
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}
