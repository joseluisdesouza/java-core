package trilha.alura.bytebankherdadoconta.modelo;

public class SeguroDeVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 42;
    }
}
