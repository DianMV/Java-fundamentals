/*Un supermercado ofrece a sus clientes descuentos de acuerdo al monto de compra, como se 
muestra en el siguiente cuadro:
Compra (S/.) Descuento (%)
100 – 250         3
251 – 500         5
501 - más         10


Dependiendo del rubro de la compra, se le aplica el siguiente impuesto sobre la compra ya descontada.
Rubro                     Impuesto (%)
Comestibles               15
Artefactos                30

El programa debe mostrar el monto de descuento, el monto del impuesto y el pago total que hará un determinado cliente. */

public class OperacionSuper {
    public double getDesc(double monto) {
        double desc = 0;
        if (monto >= 100 && monto <= 250) {
            desc = monto * 0.03;

        } else if (monto >= 251 && monto <= 500) {
            desc = monto * 0.05;

        } else if (monto >= 501) {
            desc = monto * 0.1;

        }
        return desc;
    }

    public double getImp(int opc, double comDesc) {
        double imp = 0;
        if (opc == 1) {
            imp = comDesc * 0.15;
        } else if (opc == 2) {
            imp = comDesc * 0.3;

        }
        return imp;
    }

    public double getPagoTotal(double comDesc, double imp) {
        double pagoTotal;
        pagoTotal = comDesc + imp;
        return pagoTotal;
    }

}
