/*Un club deportivo cobra incrementos sobre el pago mensual a sus socios según el tipo de 
deporte que desea practicar, tal como figura en el siguiente cuadro: 
Tipo de deporte   Incremento 
Individual             2%
Grupal                 3%
Aventura               5%

Además, si el socio lo va a practicar más de tres veces por semana tendrá un incremento del 1 % sobre el pago mensual. Elaborar un programa que calcule el monto total del incremento y 
el total a pagar por el socio.  */

public class ClubDeportivo {
    double mensualidad;

    public ClubDeportivo(double pagoM) {
        mensualidad = pagoM;
    }

    public Double getIncremento(int op, int n) {
        double increm = 0;
        switch (op) {
            case 1:
                if (n > 3) {
                    increm = mensualidad * 0.1 + mensualidad * 0.02;
                } else {
                    increm = mensualidad * 0.02;
                }
                break;
            case 2:
                if (n > 3) {
                    increm = mensualidad * 0.1 + mensualidad * 0.03;
                } else {
                    increm = mensualidad * 0.03;
                }
                break;
            case 3:
                if (n > 3) {
                    increm = mensualidad * 0.1 + mensualidad * 0.05;
                } else {
                    increm = mensualidad * 0.05;
                }
                break;
        }
        return increm;
    }

    public double getTotal(double increm) {
        double total;

        total = mensualidad + increm;
        return total;
    }

    public void showD(double increm, double total) {
        System.out.printf("Monto total de incremento: %.2f\nMonto total a pagar por el socio: %.2f", increm, total);
    }
}
