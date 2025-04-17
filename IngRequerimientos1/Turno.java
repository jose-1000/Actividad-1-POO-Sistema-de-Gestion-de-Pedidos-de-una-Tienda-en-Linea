public class Turno {
    private Paciente paciente;
    private String fecha;
    private String hora;

    public Turno(Paciente paciente, String fecha, String hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return fecha + " " + hora + " - " + paciente.toString();
    }
}