package Laboratorio_2;

import java.util.Scanner;

public class Ejemplo_2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        /* Diseñe un programa que calcule el área de un círculo. Fórmula: A = π r² */
        double r, A;
        final double PI = 3.14159;

        System.out.println("///AREA OF A CIRCLE///");

        System.out.print("Insert the radio of the circle: ");
        r = sc.nextDouble();
        sc.nextLine();

        A = PI * Math.pow(r, 2);

        System.out.println("El radio del circulo es: " + A);

    }
}
