package Laboratorio_3;

import java.util.Scanner;
/*Una compañía incrementa en 15% el sueldo actual de un empleado si es de categoría A y 10%
al de categoría B. Además, recibe un aumento especial de 160 soles si tiene más de 2 hijos.
Construir un programa que permita calcular el sueldo neto que recibirá un empleado de dicha
compañía. */

public class Ejercicio_1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        char cath;
        double in, net_income;
        int income, kids, extra;
        boolean a;
        extra = 0;
        in = 0;
        a = true;
        System.out.print("Enter your cathegory: ");
        cath = sc.next().toLowerCase().charAt(0);
        System.out.print("Enter your salary: ");
        income = sc.nextInt();
        System.out.print("how many kids do you have?: ");
        kids = sc.nextInt();

        if (cath == 'a') {
            in = income * 15 / 100;
        } else if (cath == 'b') {
            in = income * 10 / 100;
        } else {
            System.out.println("error");
            a = false;
        }
        if (kids > 2) {
            extra = 160;
        }
        net_income = income + in + extra;
        if (a == true) {
            System.out.printf("The net income would be: S/%.2f", net_income);
        }
    }

}
