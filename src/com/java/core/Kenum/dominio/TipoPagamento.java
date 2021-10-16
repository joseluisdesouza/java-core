package com.java.core.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.5;
        }
    };

    public double calcularDesconto(double valor) {
        return 0;
        /**
         * corpo do metodo não esta sendo usado, podemos definir ele
         * como metodo abstrato apenas para a sobrescrita.
         */
    }

}
