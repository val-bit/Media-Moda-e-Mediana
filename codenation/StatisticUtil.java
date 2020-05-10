package br.com.codenation;

import java.util.*;

public class StatisticUtil {

    public static int average(int[] elements) {
        int media = 0;
        int somaDosElementos = 0;
        for (int i = 0; i < elements.length; i++) {
            somaDosElementos = somaDosElementos + elements[i];
        }

        media = somaDosElementos / elements.length;

        return somaDosElementos / elements.length;
    }


	public static int mode(int[] elements) {
        int mode = elements[0];
        int conjuntoModa = 0;

        for (int i = 0; i < elements.length; i++) {
                int contador = 0;
        for (int j = 0; j < elements.length; j++) {
                if (elements[j] == elements[i]) ++contador;
            }
            if (contador > conjuntoModa) {
                mode = elements[i];
                conjuntoModa = contador;
            }
        }
                return mode;
            }


    public static int median(int[] elements) {
        int mediana = elements.length;
        Arrays.sort(elements);
        if (mediana % 2 !=0) return elements[elements.length/2];
        return (elements[(mediana-1) / 2] + elements[mediana / 2]) / 2;
    }
}







