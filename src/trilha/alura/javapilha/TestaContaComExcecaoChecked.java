package trilha.alura.javapilha;

public class TestaContaComExcecaoChecked {
    public static void main(String[] args) {
        Conta conta = new Conta();
        try {
            conta.deposita();
        } catch (MinhaException e) {
            System.out.println("tratamento...");
        }

    }
}
