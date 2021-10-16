package apostila.java.orientacao.objetos;

public class DespesasTotais {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        double somaTotalGastos = janeiro + fevereiro + marco;
        double mediaGastos = somaTotalGastos / 2;

        System.out.println("Gastos totais R$:" + somaTotalGastos +
                " e a media de gastos foi R$:" + mediaGastos);
    }
}
