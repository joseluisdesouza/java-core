package trilha.alura.bytebank.banco.teste.util;

public class TesteOutrosWrappers {
    public static void main(String[] args) {
        /**
         * A classe Number é a classe mãe
         */

        Integer idadeRef = Integer.valueOf(29);//autoboxing
        System.out.println(idadeRef.intValue());//unboxing

        Double dRef = Double.valueOf(3.2);
        Number dRefComClasseMãeNumber = Double.valueOf(3.2);
        //polimorfismo, usando a classe mais generica
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef);
        System.out.println(bRef.booleanValue());

    }
}
