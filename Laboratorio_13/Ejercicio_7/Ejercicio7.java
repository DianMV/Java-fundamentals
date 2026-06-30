/*En una sala de teatro la tarifa de la entrada por persona es de acuerdo al día de la función, tal 
como figura en la siguiente tabla:
Día de Función Tarifa (S/.)
Viernes  23.50
Sábado  33.50
Domingo 38.50

Si la persona compra de 15 a más entradas recibirá un descuento del 2% sobre el pago. Mostrar 
el descuento y el total a pagar por todas las entradas compradas. */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, op;
        Teatro p1;
        System.out.print("Cuántas entradas comprará?: ");
        n = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el día:\n[1] viernes\n[2] sábado\n[3] domingo");
        op = sc.nextInt();

        double desc;
        p1 = new Teatro();
        desc = p1.getDesc(n, op);
        p1.getTotal(desc, n, op);
        sc.close();
    }
}
