import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convertidor metro;
        double m;
        System.out.print("Ingrese el valor en metros: ");
        m = sc.nextDouble();
        sc.nextLine();

        metro = new Convertidor(m);
        double km, cm, inch;
        km = metro.getKm();
        cm = metro.getCm();
        inch = metro.getInch();
        metro.showMedidas(m, km, cm, inch);

    }
}
