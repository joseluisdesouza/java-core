package trilha.alura.refatoracaoemjavaboaspraticas.primeirospassos;

public class Banco {
    public void depositar(Conta c, double valor) {
        c.depositar(valor);
    }

    public void transfere(Conta a, double valor, Conta b) {
        a.sacar(valor);
        b.depositar(valor);
    }
}
