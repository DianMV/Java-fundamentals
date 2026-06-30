/*Diseñar un programa que permita calcular el sueldo bruto de un empleado según su tarifa y
horas trabajadas, además el descuento de 12.3 soles por cada falta que tenga y el sueldo neto.
Se debe mostrar en una boleta de pago el apellido del empleado, el mes que corresponde el
pago, sueldo bruto, descuento y sueldo neto. */
public class Empleado {
    double desc = 12.3;

    public double getSueldoBruto(double tarifa, int horas) {
        double sb;
        sb = tarifa * horas;
        return sb;

    }

    public double getDescuento(int falt) {
        double descFinal;
        descFinal = falt * desc;
        return descFinal;
    }

    public double getSueldoNeto(double sb, double desc) {
        double suelNet;
        suelNet = sb - desc;
        return suelNet;
    }

    public void mostrarBoleta(String ap, String mes, double sb, double descFinal, double suelNet) {
        System.out.println("/////////Boleta///////////");
        System.out.println("Empleado: " + ap);
        System.out.println("Mes: " + mes);
        System.out.println("Monto bruto: " + sb + " soles");
        System.out.println("Descuento:" + descFinal + "(-)");
        System.out.println("Sueldo Neto: " + suelNet + " soles");

    }

}
