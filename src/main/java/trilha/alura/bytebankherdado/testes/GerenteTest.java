package trilha.alura.bytebankherdado.testes;

import trilha.alura.bytebankherdado.Gerente;

public class GerenteTest {
    public static void main(String[] args) {

        //Autentica referencia = new Gerente();
        /**
         * Como gerente assinou o contrato da interface Autentica
         * é possivel o objeto ter a referencia desta interface
         * uma referencia muito generica logo acima
         */


        Gerente gerente = new Gerente();
        gerente.setNome("Cardoso");
        gerente.setCpf("021-8766-90");
        gerente.setSalario(6000);
        gerente.setTipo(1);
        gerente.setSenha(2222);
        System.out.println("\n--Gerente-- \nNome: " +
                gerente.getNome() +
                "\nCPF: " + gerente.getCpf() +
                "\nSalario: " + gerente.getSalario() +
                "\nTipo: " + gerente.getTipo() +
                "\nBonificação: " + gerente.getBonificacao());

        var autentica = gerente.autentica(2222);

        System.out.println("/Verificação de senha/ - true para SENHA CORRETA e false para SENHA INVALIDA: " + autentica);
    }
}
