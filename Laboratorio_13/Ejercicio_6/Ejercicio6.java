import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costo;
        int año;
        String marca;
        System.out.print("Ingrese el costo del vehículo: ");
        costo = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese cuántos años tiene el vehículo: ");
        año = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese la marca del vehículo: ");
        marca = sc.nextLine();

        VentaCarro carro1 = new VentaCarro();
        double imp, impF, desc, costoF;
        imp = carro1.getImpuesto(año, costo);
        impF = carro1.getImpAplicado(imp, costo);
        desc = carro1.getDescuento(impF, costo, marca);
        costoF = carro1.getCostoF(impF, desc);

        System.out.printf(
                "Marca: %s\nAños: %d\nPrecio Inicial: %.2f\nImpuesto: + %.2f\nDescuento: -%.2f\nCosto Total: %.2f",
                marca, año, costo, imp, desc, costoF);
        sc.close();
    }
}
