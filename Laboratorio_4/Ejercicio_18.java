package Laboratorio_4;

import java.util.Scanner;
/* La empresa Cruz del Sur realiza ofertas de pasajes a 3 destinos diferentes, sólo de acuerdo a la
cantidad de pasajes que se compra, como se muestra en el siguiente cuadro:
Destino:                  |  Precio (S/.).  |   De 4 a 10 pasajes (%)  |   De 11 a más pasajes (%)
Arequipa                     84.00.                  10                        15
Moquegua                     96.00                   15                         20
Tacna                        125.00                  20                         25
Un cliente solo puede comprar pasajes para una ciudad. Mostrar el monto de descuento y el
total que tiene que pagar un determinado cliente.
*/

public class Ejercicio_18 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        char destino;
        int n, an;
        double total, descuento;
        System.out.print("Para qué destino son los pasajes?:\n[A]Arequipa\n[B]Moquegua\n[C]Tacna ");
        destino = sc.nextLine().toLowerCase().charAt(0);
        System.out.print("cuantós pasajes quiere?: ");
        n = sc.nextInt();

        total = 0;
        descuento = 0;
        an = 0;

        switch (destino) {
            case 'a':
                if (n >= 11) {
                    descuento = 84 * 0.15;
                    total = 84 * n - descuento;
                } else if (n >= 4 && n <= 10) {
                    descuento = 84 * 0.1;
                    total = 84 * n - descuento;
                } else if (n >= 1 && n <= 3) {
                    total = 84 * n;
                } else {
                    System.out.println("Valor errado");
                    an = 1;
                }
                break;

            case 'b':
                if (n >= 11) {
                    descuento = 96 * 0.2;
                    total = 96 * n - descuento;
                } else if (n >= 4 && n <= 10) {
                    descuento = 84 * 0.15;
                    total = 96 * n - descuento;
                } else if (n >= 1 && n <= 3) {
                    total = 96 * n;
                } else {
                    System.out.println("Valor errado");
                    an = 1;
                }
                break;

            case 'c':
                if (n >= 11) {
                    descuento = 125 * 0.25;
                    total = 125 * n - descuento;
                } else if (n >= 4 && n <= 10) {
                    descuento = 125 * 0.2;
                    total = 125 * n - descuento;
                } else if (n >= 1 && n <= 3) {
                    total = 96 * n;
                } else {
                    System.out.println("Valor errado");
                    an = 1;
                }
                break;

            default:
                System.out.println("destino desconocido");
                an = 1;
                break;

        }
        if (an == 0) {
            System.out.printf("El monto a pagar con descuento incluido seria S./%.2f y el descuento seria de S/%.2f",
                    total, descuento);
        }

    }

}
