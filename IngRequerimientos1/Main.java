import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Turnos Médicos ---");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Agendar turno");
            System.out.println("3. Listar turnos por día");
            System.out.println("4. Cancelar turno");
            System.out.println("5. Mostrar historial de paciente");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    consultorio.registrarPaciente(nombre, apellido, dni, telefono);
                    break;
                case 2:
                    System.out.print("DNI del paciente: ");
                    String dniTurno = scanner.nextLine();
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fecha = scanner.nextLine();
                    System.out.print("Hora (hh:mm): ");
                    String hora = scanner.nextLine();
                    consultorio.agendarTurno(dniTurno, fecha, hora);
                    break;
                case 3:
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fechaConsulta = scanner.nextLine();
                    consultorio.listarTurnosPorDia(fechaConsulta);
                    break;
                case 4:
                    System.out.print("DNI del paciente: ");
                    String dniCancel = scanner.nextLine();
                    System.out.print("Fecha del turno: ");
                    String fechaCancel = scanner.nextLine();
                    System.out.print("Hora del turno: ");
                    String horaCancel = scanner.nextLine();
                    consultorio.cancelarTurno(dniCancel, fechaCancel, horaCancel);
                    break;
                case 5:
                    System.out.print("DNI del paciente: ");
                    String dniHist = scanner.nextLine();
                    consultorio.mostrarHistorial(dniHist);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}