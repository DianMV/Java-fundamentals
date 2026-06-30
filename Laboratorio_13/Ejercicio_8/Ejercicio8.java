import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pagoM;
        int op, n;
        ClubDeportivo p1;
        System.out.print("Ingrese el pago mensual: ");
        pagoM = sc.nextDouble();
        sc.nextLine();
        System.out.println(
                "Ingrese la opción del tipo deporte que quiera practicar:\n[1] Individual\n[2] Grupal\n[3] Aventura");
        op = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el número de veces a la semana que lo practica: ");
        n = sc.nextInt();
        sc.nextLine();

        double increm, total;

        p1 = new ClubDeportivo(pagoM);
        increm = p1.getIncremento(op, n);
        total = p1.getTotal(increm);
        p1.showD(increm, total);
        sc.close();
    }
}
