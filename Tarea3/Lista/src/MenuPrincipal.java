import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaSimulada lista = new ListaSimulada();
        int opcion, valor;

        do {
            System.out.println("\n--- Menú de Lista Simulada ---");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Eliminar un valor");
            System.out.println("4. Buscar un valor");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Valor a insertar al inicio: ");
                        valor = Integer.parseInt(sc.nextLine());
                        lista.insertarInicio(valor);
                        break;
                    case 2:
                        System.out.print("Valor a insertar al final: ");
                        valor = Integer.parseInt(sc.nextLine());
                        lista.insertarFinal(valor);
                        break;
                    case 3:
                        System.out.print("Valor a eliminar: ");
                        valor = Integer.parseInt(sc.nextLine());
                        lista.eliminar(valor);
                        break;
                    case 4:
                        System.out.print("Valor a buscar: ");
                        valor = Integer.parseInt(sc.nextLine());
                        if (lista.buscar(valor)) {
                            System.out.println("Valor encontrado en la lista.");
                        } else {
                            System.out.println("Valor no encontrado.");
                        }
                        break;
                    case 5:
                        lista.mostrar();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intenta con un número.");
                opcion = 0; // reinicia el ciclo
            }

        } while (opcion != 6);

        sc.close();
    }
}
