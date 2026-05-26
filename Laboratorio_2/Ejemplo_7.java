package Laboratorio_2;

import java.util.Scanner;

public class Ejemplo_7 {
    public static void main(String[] arg) {

        /*
         * Construir un programa que calcule el monto que pagará en cada cuota un
         * cliente que compra
         * un equipo de sonido al crédito, sabiendo que a cada cuota se le incrementa un
         * 5% de interés.
         */
        Scanner sc = new Scanner(System.in);
        int installments;
        double purchase_amount, TotalAmount;
        System.out.print("Insert the price of the purchase: ");
        purchase_amount = sc.nextDouble();
        sc.nextLine();
        System.out.print("how many installments is the purchase going to be divided into?: ");
        installments = sc.nextInt();
        sc.nextLine();
        TotalAmount = purchase_amount / installments + ((purchase_amount / installments) * 0.05);

        System.out.printf("you have %d installments and your monthly payment should be S/%.2f", installments,
                TotalAmount);

    }
}
