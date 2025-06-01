import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        int cantidad;

        // Validar que la cantidad sea máximo 10
        do {
            System.out.println("¿Cuántos estudiantes deseas ingresar? (máximo 10): ");
            cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            if (cantidad > 10) {
                System.out.println("Solo se permite ingresar hasta 10 estudiantes. Intenta nuevamente.");
            }
        } while (cantidad > 10);

        // Ingreso de datos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante #" + (i + 1));

            System.out.print("Ingresa el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Ingresa la carrera: ");
            String carrera = scanner.nextLine();

            Estudiante alumno = new Estudiante(nombre, edad, carrera);
            estudiantes.add(alumno);
        }

        // Mostrar información de los estudiantes
        System.out.println("\nInformación de los estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInformación();
            System.out.println("Nombre en mayúsculas: " + estudiante.obtenerNombreMayusculas());
            System.out.println("----------------------------");
        }
    }
}
