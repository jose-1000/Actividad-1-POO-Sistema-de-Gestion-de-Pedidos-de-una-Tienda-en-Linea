
package co.edu.tienda.modelo;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadDisponible;

    public Producto() {}

    public Producto(String nombre, String descripcion, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getCantidadDisponible() { return cantidadDisponible; }
    public void setCantidadDisponible(int cantidadDisponible) { this.cantidadDisponible = cantidadDisponible; }

    public void reducirInventario(int cantidad) {
        this.cantidadDisponible -= cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " - $" + precio + " - Stock: " + cantidadDisponible;
    }
}
