package Laboratorio_9;

import java.util.Scanner;
import java.util.Arrays;

/*Ingresar N edades a un vector Edad, luego trasladar a un nuevo vector Mayores aquellas edades
mayores e iguales a 18 años, también debe mostrarse las edades que fueron ingresadas. En caso
no se encuentre ninguna edad mayor o igual a 18 se debe mostrar un mensaje correspondiente.
Tomar en cuenta que las edades no pueden ser mayores a 100 años. */
public class Ejercicio_1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n, n2;
        System.out.print("Ingrese cuantas edades ingresará: ");
        n = sc.nextInt();
        sc.nextLine();
        int[] edad = new int[n];
        n2 = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad " + (i + 1) + " : ");
            edad[i] = sc.nextInt();
            if (edad[i] > 100) {
                System.out.println("La edad no puede ser mayor de 100 años, intenta nuevamente");
                i--;
            } else if (edad[i] >= 18) {
                n2 += 1;
            }

        }
        int[] mayor = new int[n2];
        System.out.println(Arrays.toString(edad));
        int c = 0;
        for (int j = 0; j < n; j++) {
            if (edad[j] >= 18) {
                mayor[c] = edad[j];
                c++;
            }

        }
        System.out.println("los mayores de edad son " + Arrays.toString(mayor));
    }

}
