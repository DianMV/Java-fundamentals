package Laboratorio_6;

import java.util.Scanner;

/* 1. Diseñar un programa que muestre la boleta de pago de cada mesa donde debe figurar el
número de mesa, el nombre del cliente, el monto de descuento, el pago bruto y el pago final
de consumo realizado por cada cliente del restaurante, tomar en cuenta que el cliente puede 
cancelar varios menús. Cada menú cuesta S/.8.50. Si el cliente ha cancelado de 3 a 9 menús
recibe un 5% de descuento del pago bruto y si son más de 9 recibe un 10%. Además, mostrar
el total recaudado por el restaurante y el nombre del cliente que realizó el mayor pago neto.
Incluya: ¿Desea registrar otro consumo?, para poder continuar o terminar con el programa. */

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mesa, n, op;
        double descuento, pagoBruto, pagoFinal, totalRecaudado, mayor;
        String nombre, clienteMayor;
        boolean NoquiereSalir = true;
        totalRecaudado = 0;
        mayor = -1;
        clienteMayor = "";
        while (NoquiereSalir) {
            System.out.print("Escriba el numero de mesa: ");
            mesa = sc.nextInt();
            sc.nextLine();
            System.out.print("Escriba el nombre del cliente: ");
            nombre = sc.nextLine();
            n = -1;
            while (n < 1) {
                System.out.print("Escriba cuántos menús compró?: ");
                n = sc.nextInt();
                sc.nextLine();
                if (n < 1) {
                    System.out.println("Error\nReiniciando. . . ");
                }
            }
            op = 0;
            descuento = 0;
            pagoBruto = n * 8.50;
            totalRecaudado = 0;

            if (n > 9) {
                descuento = pagoBruto * 0.1;
            } else if (n >= 3 && n <= 9) {
                descuento = pagoBruto * 0.05;
            }
            pagoFinal = pagoBruto - descuento;

            if (pagoFinal > mayor) {
                mayor = pagoFinal;
                clienteMayor = nombre;
            }

            System.out.println("//////////////////////");
            System.out.println("  Boleta de Venta     ");
            System.out.printf("Número de mesa: %d\n", mesa);
            System.out.printf("Nombre del cliente: %s\n", nombre);
            System.out.printf("Monto bruto: S/%.2f (%d menus)\n", pagoBruto, n);
            System.out.printf("Descuento: S/%.2f\n", descuento);
            System.out.printf("Monto a pagar: S/%.2f\n", pagoFinal);

            while (!(op == 1) && !(op == 2)) {
                System.out.println("//////////////");
                System.out.println("Desea salir?\n[1]Sí   [2]No");
                op = sc.nextInt();
                if (!(op == 1) && !(op == 2)) {
                    System.out.println("Dato invalido");
                }
            }
            totalRecaudado += pagoFinal;
            NoquiereSalir = (op == 2);
        }
        System.out.println("//////Reporte Final/////////");
        System.out.printf("El total recaudado es %.2f\nNombre del cliente que realizo el mayor pago neto: %s (%.2f)",
                totalRecaudado, clienteMayor, mayor);
    }

}
