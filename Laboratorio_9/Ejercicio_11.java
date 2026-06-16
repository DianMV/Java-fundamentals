package Laboratorio_9;

import java.util.Scanner;
import java.util.Arrays;

/*11. Guardar N números enteros en un vector A y M números enteros otro vector B, luego trasladar
los números pares del vector A al final del vector B. */
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Escriba el numero " + (i + 1) + " del vector A : ");
            A[i] = sc.nextInt();
            if (A[i] % 2 == 0) {
                cont += 1;
            }
        }
        System.out.println();
        int[] B = new int[5 + cont];
        for (int j = 0; j < 5; j++) {
            System.out.print("Escriba el numero " + (j + 1) + " del vector B: ");
            B[j] = sc.nextInt();
        }
        int c = 5;
        for (int k = 0; k < 5; k++) {
            if (A[k] % 2 == 0) {
                B[c] = A[k];
                c++;
            }

        }
        System.out.print(Arrays.toString(B));

    }

}
