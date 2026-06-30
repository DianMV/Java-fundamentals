/*nombre establecimiento y monto boleta */
public class Boleta {
    private String nombre;
    private double monto;

    public Boleta(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public void getBoleta() {
        System.out.printf("Establecimiento: %s\n Monto total: %.2f", nombre, monto);
    }
}