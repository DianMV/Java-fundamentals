package Laboratorio_4;

import java.util.Scanner;

/*Crear un programa que permita realizar las operaciones matemáticas básicas entre dos
números, como suma, resta, multiplicación y división, tal como lo haría una calculadora. Se
debe tomar en cuenta que en el caso de la división el segundo número ingresado no puede ser
cero ya que nos daría una división irreal. */
public class Ejercicio_1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, result;
        char type;
        int a;
        System.out.print("Enter the first number: ");
        n1 = sc.nextDouble();
        System.out.print("enter the type of operation (+, -, * or /): ");
        type = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        n2 = sc.nextDouble();
        result = 0;
        a = 0;
        switch (type) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("the number doesn't exist");
                    a = 1;
                }
                break;
            default:
                System.out.println("the operator symbol is not valid");
                a = 1;

        }
        if (a == 0) {
            System.out.printf("%.2f %c %.2f = %.2f", n1, type, n2, result);
        }

    }
}
