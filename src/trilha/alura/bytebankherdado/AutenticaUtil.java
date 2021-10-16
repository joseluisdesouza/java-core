package trilha.alura.bytebankherdado;
//classe utilitaria, que ira servir para não ocorrer duplicação de codigo em N classes
public class AutenticaUtil {

    private int senha;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
