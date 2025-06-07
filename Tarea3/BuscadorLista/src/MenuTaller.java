import java.util.Scanner;

public class MenuTaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorEstudiantes gestor = new GestorEstudiantes();
        int opcion;
        

        do {
            System.out.println("\n--- Taller de Programación ---");
            System.out.println("1. Inscribir estudiante");
            System.out.println("2. Vaciar lista de estudiantes");
            System.out.println("3. Eliminar estudiante por ID");
            System.out.println("4. Buscar estudiante por ID");
            System.out.println("5. Mostrar todos los estudiantes");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("ID del estudiante: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    Estudiante nuevo = new Estudiante(id, nombre);
                    gestor.inscribirEstudiante(nuevo);
                    break;
                case 2:
                    gestor.vaciarLista();
                    System.out.println("La lista ha sido vaciada.");
                    break;
                case 3:
                    System.out.print("ID del estudiante a eliminar: ");
                    int idEliminar = sc.nextInt();
                    if (gestor.eliminarEstudiante(idEliminar)) {
                        System.out.println("Estudiante eliminado.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("ID del estudiante a buscar: ");
                    int idBuscar = sc.nextInt();
                    if (gestor.buscarEstudiante(idBuscar)) {
                        System.out.println("Estudiante encontrado.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 5:
                    gestor.mostrarEstudiantes();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        sc.close();
    }
}
