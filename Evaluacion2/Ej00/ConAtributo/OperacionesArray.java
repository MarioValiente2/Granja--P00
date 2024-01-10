package Evaluacion2.Ej00.ConAtributo;

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
        return String.format("Array:  %s, Array ordenado:", Arrays.toString(numero));
    }
}