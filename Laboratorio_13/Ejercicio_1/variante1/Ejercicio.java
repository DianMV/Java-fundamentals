import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        double monto;
        Boleta[] boletas = new Boleta[2];

        System.out.print("Inserte el nombre del establecimiento: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el monto del producto: ");
        monto = sc.nextDouble();
        sc.nextLine();
        boletas[0] = new Boleta(nombre, monto);

        System.out.print("Inserte el nombre del establecimiento: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el monto del producto: ");
        monto = sc.nextDouble();
        sc.nextLine();
        boletas[1] = new Boleta(nombre, monto);

        boletas[0].getBoleta();
        boletas[1].getBoleta();

    }
}
