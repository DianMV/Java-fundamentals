package Laboratorio_2;

import java.util.Scanner;

public class Ejemplo_3 {
    /*
     * Escriba programa para ingresar 3 notas de un alumno, calcular y mostrar su
     * promedio,
     * sabiendo que la tercera nota tiene doble peso.
     */
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int i, sum, grade, GA;
        i = 1;
        sum = 0;

        while (i <= 3) {
            System.out.printf("Insert the student %d grade : ", i);
            grade = sc.nextInt();
            if (i == 3) {
                sum += (grade * 2);
                break;
            }
            sum += grade;
            i++;
        }
        GA = sum / 4;
        System.out.printf("The grade average is: %d", GA);
    }
}
