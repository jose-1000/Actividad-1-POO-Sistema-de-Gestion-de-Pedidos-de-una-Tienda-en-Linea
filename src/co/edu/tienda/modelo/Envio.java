
package co.edu.tienda.modelo;

public class Envio {
    private String direccion;
    private String estadoEnvio;
    private String numeroSeguimiento;

    public Envio() {}

    public Envio(String direccion) {
        this.direccion = direccion;
        this.estadoEnvio = "Pendiente";
        this.numeroSeguimiento = "ENV-" + System.currentTimeMillis();
    }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getEstadoEnvio() { return estadoEnvio; }
    public void setEstadoEnvio(String estadoEnvio) { this.estadoEnvio = estadoEnvio; }

    public String getNumeroSeguimiento() { return numeroSeguimiento; }

    @Override
    public String toString() {
        return "Envio a: " + direccion + ", Estado: " + estadoEnvio + ", Seguimiento: " + numeroSeguimiento;
    }
}
