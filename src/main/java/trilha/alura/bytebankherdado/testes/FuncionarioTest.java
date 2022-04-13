package trilha.alura.bytebankherdado.testes;

import trilha.alura.bytebankherdado.Funcionario;
import trilha.alura.bytebankherdado.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Pedro");
        funcionario.setCpf("Pedro");
        funcionario.setSalario(2500);
        funcionario.setTipo(1);
        funcionario.getBonificacao();
        System.out.println("\nFuncionario: \n" +
                funcionario.getNome() +
                "\n" + funcionario.getCpf() +
                "\n" + funcionario.getSalario() +
                "\n" + funcionario.getTipo() +
                "\nBonificação: " + funcionario.getBonificacao());

//        Funcionario funcionario2 = new Funcionario("João", "867895659", 5000.0);
//        funcionario2.getBonificacao();
//        System.out.println("\nFuncionario: \n" +
//                funcionario2.getNome() +
//                "\n" + funcionario2.getCpf() +
//                "\n" + funcionario2.getSalario() +
//                "\n" + funcionario2.getTipo() +
//                "\nBonificação: " + funcionario2.getBonificacao());

    }
}
