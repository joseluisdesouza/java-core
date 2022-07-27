package com.java.core.Sformatacao;

import java.util.Locale;

public class NumberFormat {
    public static void main(String[] args) {
        Locale localeDf = Locale.getDefault();
        Locale localePt = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;
        java.text.NumberFormat[] numberFormats = new java.text.NumberFormat[4];
        numberFormats[0] = java.text.NumberFormat.getCurrencyInstance(localeDf);
        numberFormats[1] = java.text.NumberFormat.getCurrencyInstance(localePt);
        numberFormats[2] = java.text.NumberFormat.getCurrencyInstance(localeJp);
        numberFormats[3] = java.text.NumberFormat.getCurrencyInstance(localeIt);
        double valor = 1_000;
        for (java.text.NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
