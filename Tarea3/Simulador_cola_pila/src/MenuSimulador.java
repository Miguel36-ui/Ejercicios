import java.util.Scanner;

public class MenuSimulador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimuladorPila pila = new SimuladorPila();
        SimuladorCola cola = new SimuladorCola();

        int opcion;

        do {
            System.out.println("\n========= MENÚ SIMULADOR =========");
            System.out.println("1. Abrir archivo ");
            System.out.println("2. Cerrar archivo ");
            System.out.println("3. Mostrar archivos abiertos");
            System.out.println("4. Agregar cliente a la cola");
            System.out.println("5. Atender cliente (Dequeue)");
            System.out.println("6. Mostrar cola de clientes");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingresa una opción válida (1-7): ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del archivo: ");
                    String archivo = sc.nextLine();
                    pila.abrirArchivo(archivo);
                    break;
                case 2:
                    pila.cerrarArchivo();
                    break;
                case 3:
                    pila.mostrarArchivosAbiertos();
                    break;
                case 4:
                    System.out.print("Nombre del cliente: ");
                    String cliente = sc.nextLine();
                    cola.nuevoCliente(cliente);
                    break;
                case 5:
                    cola.atenderCliente();
                    break;
                case 6:
                    cola.mostrarCola();
                    break;
                case 7:
                    System.out.println("Saliendo del simulador...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);

        sc.close();
    }
}
