package Laboratorio_9;

import java.util.Scanner;
/*10. Almacenar en un vector los nombres de N empleados de una empresa, en otro vector las horas
trabajadas, se pide calcular y mostrar los sueldos de los trabajadores sabiendo que el pago por
cada hora varía según el total de horas trabajadas: 
Horas trabajadas |      Pago por hora (S/.)
1 – 40                     20
41 – 80                    25
81 – mas                   27     */

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Escriba el número de empleados?: ");
        n = sc.nextInt();
        sc.nextLine();
        String[] nombre = new String[n];
        int[] horas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Escriba el nombre del empleado " + (i + 1) + " : ");
            nombre[i] = sc.nextLine();
            System.out.print("Escriba las horas trabajadas: ");
            horas[i] = sc.nextInt();
            sc.nextLine();

        }

        for (int i = 0; i < n; i++) {
            int sueldo = 0;
            if (horas[i] >= 1 && horas[i] <= 40) {
                sueldo = horas[i] * 20;
                System.out.printf("El sueldo de %s es %d\n", nombre[i], sueldo);
            } else if (horas[i] >= 41 && horas[i] <= 80) {
                sueldo = horas[i] * 25;
                System.out.printf("El sueldo de %s es %d\n", nombre[i], sueldo);
            } else if (horas[i] >= 81) {
                sueldo = horas[i] * 27;
                System.out.printf("El sueldo de %s es %d\n", nombre[i], sueldo);
            }
        }

    }

}
