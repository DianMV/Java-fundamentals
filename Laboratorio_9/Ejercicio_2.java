package Laboratorio_9;

import java.util.Scanner;
import java.util.Arrays;

/*2.Guardar N números en un vector A, luego reemplace el contenido del número menor por el
acumulado de la suma de todos los números que se ubican después de este. Por ejemplo, si el
menor está en la posición 3 sume a partir de la posición 4 hacia la posición N. */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum, menor, posicionMenor;
        menor = Integer.MAX_VALUE;
        System.out.print("Escriba cuántos números habrán: ");
        n = sc.nextInt();
        sc.nextLine();
        int[] A = new int[n];
        sum = 0;
        posicionMenor = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Escriba el numero " + (i + 1) + " : ");
            A[i] = sc.nextInt();
            sum += A[i];
            if (A[i] < menor) {
                menor = A[i];
                posicionMenor = i;
            }

        }
        A[posicionMenor] = sum;
        System.out.println(Arrays.toString(A));
    }

}
