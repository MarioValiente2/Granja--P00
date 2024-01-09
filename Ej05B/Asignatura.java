package Metodos.Ej05B;

import java.util.Random;

public class Asignatura {
    private int codigo;
    private double calificacion;

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public int getCodigo() {
        Random random = new Random();
        codigo = random.nextInt(1, 100);
        return codigo;
    }

}


