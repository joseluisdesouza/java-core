package trilha.alura.bytebankherdadoconta.modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaPoupanca: " + "Numero," + getNumero() + " Agencia," + getAgencia()  + "Saldo, " + getSaldo();
    }
}
