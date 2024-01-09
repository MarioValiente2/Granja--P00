package Metodos.Ej00.ConAtributo;

import java.util.Arrays;

public class OperacionesArray {
    private int [] numero ;

    public OperacionesArray(){
        numero = new int[7];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 10);
        }
    }


    public String toString(){
        return String.format("Array:  %s, Array ordenado: %s", Arrays.toString(numero));
    }
}