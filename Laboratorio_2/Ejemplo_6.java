package Laboratorio_2;

import java.util.Scanner;

public class Ejemplo_6 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        /*
         * Dado un número natural de 4 cifras diseñe un programa que permita mostrar en
         * la salida el
         * número al revés. Por ejemplo: entrada=2345 y salida=5432.
         */
        int n, first_Number, rest_1, second_Number, rest_2, third_Number, fourth_Number;
        System.out.print("Insert a 4-digit number: ");
        n = sc.nextInt();
        sc.nextLine();

        first_Number = n % 10;
        rest_1 = n / 10;
        second_Number = rest_1 % 10;
        rest_2 = rest_1 / 10;
        third_Number = rest_2 % 10;
        fourth_Number = rest_2 / 10;

        System.out.printf("%d%d%d%d", first_Number, second_Number, third_Number, fourth_Number);

    }

}
