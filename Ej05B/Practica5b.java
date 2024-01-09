package Metodos.Ej05B;

import java.util.Scanner;

public class Practica5b {
    public static void main(String[] args) {

        String asig1;
        String asig2;
        String asig3;
        String alumno;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del alumno");
        alumno = scanner.nextLine();
        System.out.println("Introduzca el nombre de las asignaturas");
        asig1 = scanner.next();
        asig2 = scanner.next();
        asig3 = scanner.next();
        Alumno datos = new Alumno(asig1, asig2, asig3);
        Asignatura code=new Asignatura();
        Profesor profesor=new Profesor();
        System.out.println("Tus asignaturas son:");
        System.out.println(datos.getAsignatura1() +" ("+code.getCodigo()+")");
        System.out.println(datos.getAsignatura2()+" ("+code.getCodigo()+")");
        System.out.println(datos.getAsignatura3()+" ("+code.getCodigo()+")");
        System.out.println("Tu nombre es: " + alumno);
        profesor.ponerNotas(datos);
    }


}
