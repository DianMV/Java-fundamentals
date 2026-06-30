/*El club El Bosque cobra incrementos sobre el pago mensual a sus socios según el servicio, tal
como figura en el siguiente cuadro:


Servicio     Incremento
Comidas.        5%
Sauna           7%         
Hospedaje       9%          

Además, si el socio tiene más de 60 años recibe un descuento del 2 % sobre el pago mensual
ya incrementado. Elaborar un programa que calcule el monto del incremento y el total a pagar
por el socio.*/
public class ClubCobros {

    public double getIncrement(int op, double men) {
        double incremen = 0;
        switch (op) {
            case 1:
                incremen = men * 0.05;
                break;
            case 2:
                incremen = men * 0.07;
                break;
            case 3:
                incremen = men * 0.09;
                break;
        }
        return incremen;
    }

    public double getMonIncremt(double men, double incre) {
        double montoIn = 0;
        montoIn = men + incre;
        return montoIn;
    }

    public double getDesc(int edad, double pagoMenInsc) {
        double desc = 0;
        if (edad > 60) {
            desc = pagoMenInsc * 0.02;
        }
        return desc;
    }

    public void getPagoTotal(double pagoMenInsc, double desc) {
        double pagoTotal = 0;
        pagoTotal = pagoMenInsc - desc;
        System.out.print("el pago total es S" + pagoTotal);

    }

}
