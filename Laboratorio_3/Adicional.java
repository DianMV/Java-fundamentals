package Laboratorio_3;

import java.util.Scanner;
/*Escribir un programa en Java que solicite un número entero de tres cifras y muestre la suma desus dígitos.
• Mostrar el reporte formateado como se indica. Por ejemplo, si el usuario ingresa 235, la suma de sus
dígitos es 10, y deberá mostrarse el mensaje:
“la suma de 2 + 3 + 5 = 10”
• Indicar adicionalmente si el número ingresado tuvo o no tres cifras. */

public class Adicional {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n, a, b, c, rest, sum;

        System.out.print("write a 3-digit number: ");
        n = sc.nextInt();
        boolean its_A_3digit = (n > 99 && n <= 999);

        if (its_A_3digit) {
            a = n % 10;
            rest = n / 10;
            b = rest % 10;
            c = rest / 10;
            sum = a + b + c;
            System.out.printf("the addition of the digits of that number is %d", sum);
        } else {
            System.out.println("the number is not a 3-digit number");
        }

    }

}
