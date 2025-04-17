
package co.edu.tienda.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private String estado;
    private Pago pago;
    private Envio envio;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public Pedido(Cliente cliente) {
        this();
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        producto.reducirInventario(1);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total + 10.0; // ejemplo: gastos de envío
    }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public List<Producto> getProductos() { return productos; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Pago getPago() { return pago; }
    public void setPago(Pago pago) { this.pago = pago; }

    public Envio getEnvio() { return envio; }
    public void setEnvio(Envio envio) { this.envio = envio; }

    @Override
    public String toString() {
        return "Pedido de " + cliente.getNombre() + ": " + productos.size() + " productos, Estado: " + estado;
    }
}
