
package co.edu.tienda;

import co.edu.tienda.modelo.*;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "juan@gmail.com", "Calle 123");
        Producto prod1 = new Producto("Laptop", "Laptop i7", 3000.0, 5);
        Producto prod2 = new Producto("Mouse", "Mouse inalámbrico", 50.0, 10);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(prod1);
        pedido.agregarProducto(prod2);

        Pago pago = new Pago("Tarjeta de crédito", pedido.calcularTotal());
        pedido.setPago(pago);
        pedido.setEstado("Confirmado");

        Envio envio = new Envio(cliente.getDireccion());
        pedido.setEnvio(envio);

        cliente.agregarPedido(pedido);

        System.out.println(cliente);
        System.out.println(pedido);
        System.out.println(pago);
        System.out.println(envio);
    }
}
