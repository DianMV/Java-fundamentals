import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double men;
        int op, edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la mensualidad que paga por el club: ");
        men = sc.nextDouble();
        sc.nextLine();
        do {
            System.out.println("Ingrese el servicio que usa:\n[1]Comidas\n[2]Saunas\n[3]Hospedaje");
            op = sc.nextInt();
            sc.nextLine();
        } while (op <= 0 || op >= 4);
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();

        double inc, totalIn, desc;
        ClubCobros cliente = new ClubCobros();
        inc = cliente.getIncrement(op, men);
        totalIn = cliente.getMonIncremt(men, inc);
        desc = cliente.getDesc(edad, totalIn);
        cliente.getPagoTotal(totalIn, desc);
        sc.close();
    }
}