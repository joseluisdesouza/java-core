package trilha.alura.bytebankherdadoconta.teste;

public class Teste {
    public static void main(String[] args) {

        System.out.println("texto");
        System.out.println(2);
        System.out.println(true);

    }

    /**
     * sobrecarga de metodo, mesmo nome com paremtros diferentes
     */
    static void println() {
    }

    static void println(int i) {
    }

    static void println(boolean x) {
    }
}
