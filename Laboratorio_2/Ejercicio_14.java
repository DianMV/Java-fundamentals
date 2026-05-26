package Laboratorio_2;

import java.util.Scanner;

/*Una veterinaria atendió una cantidad de perros, gatos y aves, se desea saber el porcentaje de
perros, gatos y aves que representa cada una de las cantidades. */
public class Ejercicio_14 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int dog, cat, bird, total_amount;

        System.out.print("Write the dogs amount: ");
        dog = sc.nextInt();
        System.out.print("Write the cats amount: ");
        cat = sc.nextInt();
        System.out.print("Write the birds amount: ");
        bird = sc.nextInt();
        total_amount = dog + cat + bird;

        int[] amount = { dog, cat, bird };
        String[] type = { "dogs", "cats", "birds" };
        for (int i = 0; i < amount.length; i++) {
            double percentage = ((double) amount[i] / total_amount) * 100;

            System.out.printf("The %s represent the %.2f%%\n", type[i], percentage);

        }

    }
}
