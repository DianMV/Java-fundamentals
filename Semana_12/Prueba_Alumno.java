package Semana_12;

public class Prueba_Alumno {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("a", "Diane", 25, 16, 15, 18, 17);
        alumno1.setNombre("Dian");
        String x = alumno1.getNombre();
        String nombre = alumno1.getNombre();
        int edad = alumno1.getEdad();
        int p1 = alumno1.getPractica1();
        int p2 = alumno1.getPractica2();
        int p3 = alumno1.getPractica3();
        int ef = alumno1.getExamenFinal();
        double prom = alumno1.promedio();
        System.out.println(x);

        System.out.printf(
                "Alumno 1: %s\nEdad: %d\nPractica1: %d\nPractica 2: %d\nPractica 3: %d\nExamenFinal: %d\nPromedio: %.1f",
                nombre, edad, p1, p2, p3, ef, prom);
    }

}
