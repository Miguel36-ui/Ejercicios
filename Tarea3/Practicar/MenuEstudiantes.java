import java.util.Scanner;

public class MenuEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorEstudiantes gestor = new GestorEstudiantes();
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE ESTUDIANTES ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            
            while (!sc.hasNextInt()) {
                System.out.print("Ingresa un número válido: ");
                sc.next(); // limpiar entrada inválida
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Promedio: ");
                    while (!sc.hasNextDouble()) {
                        System.out.print("Ingresa un número válido para el promedio: ");
                        sc.next();
                    }
                    double promedio = sc.nextDouble();
                    gestor.insertarEstudiante(nombre, promedio);
                    break;
                case 2:
                    gestor.mostrarEstudiantes();
                    break;
                case 3:
                    System.out.print("Nombre a buscar: ");
                    nombre = sc.nextLine();
                    gestor.buscarEstudiante(nombre);
                    break;
                case 4:
                    System.out.print("Nombre a eliminar: ");
                    nombre = sc.nextLine();
                    gestor.eliminarEstudiante(nombre);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
        
        sc.close();
    }
}
