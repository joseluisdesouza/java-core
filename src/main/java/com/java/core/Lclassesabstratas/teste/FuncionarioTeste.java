package com.java.core.Lclassesabstratas.teste;

import com.java.core.Lclassesabstratas.dominio.Desenvolvedor;
import com.java.core.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
//        Funcionario funcionario = new Funcionario("Di maria", 3500.0);
//        System.out.println(funcionario);
        //classes abstratas não podem ser instanciadas

        Gerente gerente = new Gerente("Vegeta", 8000.0);
        gerente.calculaBonus();
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Nappa", 7000.0);
        desenvolvedor.calculaBonus();
        System.out.println(desenvolvedor);

        /**
         * ate aqui tudo certo mas funcionario é algo muito abstrato,
         * não existe uma pessoa somente funcionario, ela é alguma coisa
         * por isso podemos definiar a classe Funcionario como uma classe abstrata
         * sendo assim tornando-a impossivel para instanciacçao de objetos, sera
         * usada apenas para uso de suas funcionalidades, tipo um template
         */
    }
}
