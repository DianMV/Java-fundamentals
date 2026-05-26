package Laboratorio_3;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String type;
        int n, price, a;
        double totalPrice;
        System.out.print("escribe el tipo de pantalon: ");
        type = sc.nextLine().toLowerCase();
        System.out.print("cuantos quisiera comprar?: ");
        n = sc.nextInt();
        price = 0;
        totalPrice = 0;
        a = 0;
        if (type.equals("deportivo")) {
            price = 50 * n;
        } else if (type.equals("casual")) {
            price = 60 * n;
        } else if (type.equals("elegante")) {
            price = 70 * n;
        } else {
            System.out.println("ERROR");
            a = 1;
        }
        if (a == 0) {

            if (n >= 1 && n <= 10) {
                totalPrice = price - price * 0.03;
            }
            if (n >= 11 && n <= 16) {
                totalPrice = price - price * 0.05;
            }
            if (n >= 17) {
                totalPrice = price - price * 0.07;
            }
            System.out.printf("el precio con el descuento incluido, seria: %.2f", totalPrice);
        }
    }
}
