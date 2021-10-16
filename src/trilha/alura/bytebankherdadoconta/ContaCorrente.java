package trilha.alura.bytebankherdadoconta;

public class ContaCorrente extends Conta implements Tributavel {

    /**
     * Construtores não são herdados da classe mãe(super)
     * e atraves do super podemos fazer a chamada para o construtor  da classe super.
     */
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    /**
     * nesse momento é pedido que na conta corrente quando o cliente for sacar, sera descontado
     * uma pequena taxa.
     */

    //apenas escrevi saca e a IDE ja me mostrou como fazer
    @Override
    public void saca(double valor) {
        //sera sacado o valor desejado e mais 20 centavos de taxa
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
