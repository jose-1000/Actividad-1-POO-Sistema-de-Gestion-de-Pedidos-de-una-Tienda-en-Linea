
package co.edu.tienda.modelo;

public class Pago {
    private String metodo;
    private double monto;
    private boolean realizado;

    public Pago() {}

    public Pago(String metodo, double monto) {
        this.metodo = metodo;
        this.monto = monto;
        this.realizado = true;
    }

    public String getMetodo() { return metodo; }
    public void setMetodo(String metodo) { this.metodo = metodo; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public boolean isRealizado() { return realizado; }
    public void setRealizado(boolean realizado) { this.realizado = realizado; }

    @Override
    public String toString() {
        return "Pago por " + metodo + ", Monto: $" + monto + ", Realizado: " + realizado;
    }
}
