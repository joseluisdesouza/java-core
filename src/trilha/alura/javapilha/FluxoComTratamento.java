package trilha.alura.javapilha;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException e) {
            /**
             * Tratando duas exceptions
             */
            var mensagem = e.getMessage();
            System.out.println("Exception " + mensagem);
            e.printStackTrace();
        } //catch (NullPointerException e) {
            /**
             * A primeira vista poderiamos fazer assim mas podemos fazer
             * tudo isso na linha 9 veja
             */
            // var mensagem = e.getMessage();
            //System.out.println("ArithmeticException "+mensagem);
           // e.printStackTrace();
       // }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
       // try {
            metodo2();
       // } catch (ArithmeticException e) {
            //System.out.println("ArithmeticException");
       // }
        /**
         * podemos tratar aqui tambem, mas ainda não
         * é o lugar ideal
         */
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //try {
                //int a = i / 0;
            //} catch (ArithmeticException ex) {
           //     System.out.println("Não divide por zero");
           // }
            /**
             * podemos tratar esse erro antes de chegar aqui
             */


            Conta conta = null;
            conta.deposita();
            /**
             * Vamos gerar mais um erro, estou tentando acessar uma referencia
             * de um objeto que não existe. Tratar no try-catch da linha 7
             */
        }
        System.out.println("Fim do metodo2");
    }
}
