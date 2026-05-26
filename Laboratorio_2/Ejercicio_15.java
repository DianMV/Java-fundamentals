package Laboratorio_2;

import java.util.Scanner;
/*Dado un número natural de 5 cifras diseñe un programa que permita sumar el primer y el
último dígito. Por ejemplo: 23456 la suma debe ser 2+6=8. */

public class Ejercicio_15 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n, sum, n1, n2;
        System.out.print("Insert a 5-digit number: ");
        n = sc.nextInt();
        sc.nextLine();
        n2 = n % 10;
        n1 = n / 10000;
        sum = n1 + n2;
        System.out.printf("The addition of first number (%d) and last number (%d) is: %d", n1, n2, sum);
    }

}
