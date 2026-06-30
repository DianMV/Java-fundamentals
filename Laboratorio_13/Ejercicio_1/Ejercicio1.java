import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int falt, horas;
        double tarifa, sueldoNeto, sueldoBruto, descTotal;
        String mes, ap;

        System.out.print("Ingrese el apellido del trabajador: ");
        ap = sc.nextLine();
        System.out.print("Ingrese el mes: ");
        mes = sc.nextLine();
        System.out.print("Ingrese la tarifa por hora: ");
        tarifa = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horas = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese cuántas faltas hubieron durante el mes: ");
        falt = sc.nextInt();
        sc.nextLine();

        Empleado Diane = new Empleado();
        sueldoBruto = Diane.getSueldoBruto(tarifa, horas);
        descTotal = Diane.getDescuento(falt);
        sueldoNeto = Diane.getSueldoNeto(sueldoBruto, descTotal);
        Diane.mostrarBoleta(ap, mes, sueldoBruto, descTotal, sueldoNeto);
        sc.close();
    }

}
