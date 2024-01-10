package Evaluacion2.Ej00.SinAtributo;

import java.util.Arrays;
import java.util.Random;

public class OperacionesArray {


    public static void cargar(int numero[]){
        Random random=new Random();
        for (int i = 0; i < numero.length ; i++) {
            numero[i]= random.nextInt(1,100);
        }

    }

    public static void mostrar(int numero[]){
        for (int i = 0; i < numero.length ; i++) {
            System.out.print(numero[i]+" ");
        }
    }

    public static void ordenar(int numero[]){
        Arrays.sort(numero);
    }

    public static double media (int[] numero){
        double suma=0;
        for (int i = 0; i < numero.length ; i++) {
            suma=suma+numero[i];

        }
        return suma/10;
    }

    public static void invertir(int numero[]){
        int copia[] = new int[numero.length];
        for (int i = 0; i < numero.length; i++) {
            copia[i] = numero[i];
        }
        for (int i = 0; i < copia.length/2; i++) {
            int a = copia[i];
            copia[i] = copia[copia.length-i-1];
            copia[copia.length-i-1] = a;
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.print(copia[i]+" ");
        }
    }
}