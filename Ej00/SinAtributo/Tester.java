package Metodos.Ej00.SinAtributo;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int numero[]=new int[10];
        OperacionesArray.cargar(numero);
        System.out.println("Array Inicial");
        OperacionesArray.mostrar(numero);
        System.out.println();
        System.out.println("Array ordenado");
        OperacionesArray.ordenar(numero);
        OperacionesArray.mostrar(numero);
        System.out.println();
        double media=OperacionesArray.media(numero);
        System.out.println("La media es: "+media);
        System.out.println("Array Invertido");
        OperacionesArray.invertir(numero);

    }

}
