package trilha.alura.bytebankherdadoconta.modelo;

public class GuardadorDeReferencias {
    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int posicaoPassada) {
        return this.referencias[posicaoPassada];
    }
}
