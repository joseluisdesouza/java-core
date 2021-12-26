package trilha.alura.bytebankherdadoconta.modelo;

public class CalculadorImposto  {

    private double totalImposto;

    public void registra(Tributavel tributavel) {
        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        System.out.println("\nTotal de impostos é: ");
        return totalImposto;
    }

    /**
     * Aqui acontece que todas as classes que assinarem o contrato da interface
     * Tributal, tera acesso a esse metodo.
     *
     * Repare que esse tributavel que esta como parametro pode ser qualquer coisa,
     * um seguro de vida, uma ação na bolsa e etc...
     */
}
