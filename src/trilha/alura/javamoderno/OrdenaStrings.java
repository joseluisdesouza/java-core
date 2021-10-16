package trilha.alura.javamoderno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("palavra1");
        palavras.add("essa palavra");
        palavras.add("uma outra palavra");

//        Comparator<String> comparator = new ComparadorDeStringPorTamanho();
//        comparador.compare(palavras);

        Collections.sort(palavras);
        System.out.println(palavras + " - Pelo Collections");

        for (String palavra : palavras) {
            System.out.println(palavra + " - Por um for tradicional");
        }
    }

    class ComparadorDeStringPorTamanho implements Comparator<String> {

        public int compare(String s1, String s2) {
            if (s1.length() < s2.length())
                return -1;
            if (s1.length() > s2.length())
                return 1;
            return 0;
        }

    }
}
