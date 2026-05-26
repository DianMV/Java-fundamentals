package Laboratorio_3;

import java.util.Scanner;

/*Construir un programa que calcule el monto final que un cliente paga por un auto, sabiendo
que, si el costo original es $5000 o más se le cobra un adicional del 8% del costo original por
impuesto y si es de la marca Toyota obtiene un descuento del 6% del costo original.  */
public class Ejercicio_2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        double price, tax, total_amount;
        String make;
        System.out.print("how much is the car?: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.print("what's the make?: ");
        make = sc.nextLine().toLowerCase();
        boolean esToyota = (make.equals("toyota"));
        boolean upTo5000 = price >= 5000;

        tax = 0;
        if (upTo5000) {
            tax = price * 8 / 100;
        }
        if (esToyota) {
            price -= price * 6 / 100;
        }
        total_amount = price + tax;
        System.out.printf("The total amount would be: %.2f", total_amount);
    }
}
