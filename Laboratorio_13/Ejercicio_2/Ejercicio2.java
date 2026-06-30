import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        double montoC;
        do {
            System.out.print("Ingrese el monto de la compra: ");
            montoC = sc.nextDouble();
        } while (montoC <= 0);
        do {
            System.out.println("ingrese el rubro de compra\n[1] Comestibles\n[2]Artefactos");
            op = sc.nextInt();
        } while (op != 1 && op != 2);

        OperacionSuper compra = new OperacionSuper();
        double desc, imp, comDesc, pagoTotal;
        desc = compra.getDesc(montoC);
        comDesc = montoC - desc;
        imp = compra.getImp(op, comDesc);
        pagoTotal = compra.getPagoTotal(comDesc, imp);

        System.out.printf("Monto: %.2f\nDescuento: -%.2f\nImpuestos: +%.2f\nPago Final: %.2f", montoC, desc, imp,
                pagoTotal);
        sc.close();
    }
}
