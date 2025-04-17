
package co.edu.tienda.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private String direccion;
    private List<Pedido> historialPedidos;

    public Cliente() {
        this.historialPedidos = new ArrayList<>();
    }

    public Cliente(String nombre, String correo, String direccion) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.historialPedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        historialPedidos.add(pedido);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public List<Pedido> getHistorialPedidos() { return historialPedidos; }

    @Override
    public String toString() {
        return "Cliente:\n" +
                "Nombre: " + nombre + "\n" +
                "Correo: " + correo + "\n" +
                "Dirección: " + direccion + "\n" +
                "Pedidos: " + historialPedidos.size();
    }
}
