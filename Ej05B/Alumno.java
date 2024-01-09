package Metodos.Ej05B;

public class Alumno {

    private  String asignatura1;
    private  String asignatura2;
    private  String asignatura3;

    public Alumno(String asig1, String asig2, String asig3) {
        asignatura1=asig1;
        asignatura2=asig2;
        asignatura3=asig3;
    }
    public String getAsignatura1(){
        return asignatura1;
    }
    public String getAsignatura2(){
        return asignatura2;
    }
    public String getAsignatura3(){
        return asignatura3;
    }
}
