package trilha.alura.bytebankherdadoconta.modelo;

/**
 * Esta classe a partir do capitulo Classes e Metodos abstratos passou a ser abstrata tornando impossivel a instanciação dela
 * servindo de classe para uso de suas subclasses
 *
 * @author josé l. souza
 */
public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    /**
     * Tornamos o metodo abstrato, metodos abstratos não contem corpo
     * Porem vale lembrar que se os metodos não forem abstratos, eles serão concretos normalmente
     */
    public abstract void deposita(double valor);

    /**
     * Metodo de sacar valor, verifica se o saldo é menor que o valor, caso for lança Exception
     * se não pega o saldo e subtrai pelo valor passado.
     *
     * @param valor
     */
    public void saca(double valor) {
        if (this.saldo < valor) {
         throw new SaldoUnsuficienteException("Saldo " + this.saldo + ", Valor " + valor);
        }
        this.saldo -= valor;
        /**
         * No curso Java Exceções, vamos melhorar esse trecho de
         * codigo.
         */
    }

    /**
     * Metodo transfere - primeiro valida de o saque depois pega a conta destino e desposita o valor passado
     * outra conta seria outro objeto Conta.
     *
     * @param valor
     * @param destino
     */
    public void transfere(double valor, Conta destino) {
        this.saca(valor) ;
            destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
