/* Una empresa que vende autos usados aplica un impuesto sobre el costo del vehículo, según el
número de años de antigüedad, tal como figura en el siguiente cuadro:

  Número de años                Porcentaje de impuesto
         5 a 9                          2 %
         10 a 15                        4 %
         16 a más                       6 %
         
Otorga un descuento de 200 soles sobre el costo con el impuesto ya aplicado sólo a los
vehículos de la marca Nissan. Mostrar el monto del impuesto y el costo final del vehículo. */

public class VentaCarro {

    public double getImpuesto(int años, double costo) {
        double impuesto = 0;
        if (años >= 5 && años <= 9) {
            impuesto = costo * 0.02;
        } else if (años >= 10 && años <= 15) {
            impuesto = costo * 0.04;
        } else if (años >= 16) {
            impuesto = costo * 0.06;
        }
        return impuesto;
    }

    public double getImpAplicado(double imp, double costo) {
        double impAplicado = 0;
        impAplicado = costo + imp;
        return impAplicado;

    }

    public double getDescuento(double impAplicado, double costo, String marca) {
        double descuento = 0;

        if (marca.equalsIgnoreCase("Nissan")) {
            descuento = 200;
        }
        return descuento;
    }

    public double getCostoF(double impAplicado, double desc) {
        double costoF;
        costoF = impAplicado - desc;
        return costoF;
    }

}
