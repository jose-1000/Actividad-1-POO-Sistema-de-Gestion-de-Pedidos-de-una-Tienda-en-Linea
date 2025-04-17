import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Turno> turnos = new ArrayList<>();

    public void registrarPaciente(String nombre, String apellido, String dni, String telefono) {
        Paciente paciente = new Paciente(nombre, apellido, dni, telefono);
        pacientes.add(paciente);
    }

    public Paciente buscarPacientePorDni(String dni) {
        for (Paciente p : pacientes) {
            if (p.getDni().equals(dni)) {
                return p;
            }
        }
        return null;
    }

    public void agendarTurno(String dni, String fecha, String hora) {
        Paciente paciente = buscarPacientePorDni(dni);
        if (paciente != null) {
            Turno turno = new Turno(paciente, fecha, hora);
            turnos.add(turno);
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    public void listarTurnosPorDia(String fecha) {
        for (Turno t : turnos) {
            if (t.getFecha().equals(fecha)) {
                System.out.println(t);
            }
        }
    }

    public void cancelarTurno(String dni, String fecha, String hora) {
        turnos.removeIf(t -> t.getPaciente().getDni().equals(dni) &&
                              t.getFecha().equals(fecha) &&
                              t.getHora().equals(hora));
    }

    public void mostrarHistorial(String dni) {
        for (Turno t : turnos) {
            if (t.getPaciente().getDni().equals(dni)) {
                System.out.println(t);
            }
        }
    }
}