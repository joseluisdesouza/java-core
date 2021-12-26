package trilha.alura.bytebankherdadoconta.teste;

import trilha.alura.bytebankherdadoconta.modelo.CalculadorImposto;
import trilha.alura.bytebankherdadoconta.modelo.ContaCorrente;
import trilha.alura.bytebankherdadoconta.modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.registra(cc);
        ci.registra(seguroDeVida);

        System.out.println(ci.getTotalImposto());
    }
}
