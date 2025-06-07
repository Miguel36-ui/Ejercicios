import java.util.Scanner;

public class MenuCalculadora {

    private Calculadora calculadora;
    private Scanner sc;

    public MenuCalculadora() {
        calculadora = new Calculadora();
        sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Suma (+)");
            System.out.println("2. Resta (-)");
            System.out.println("3. Multiplicación (*)");
            System.out.println("4. División (/)");
            System.out.println("5. Factorial (!)");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            try {
                ejecutarOpcion(opcion);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 6);

        sc.close();
        System.out.println("Gracias por usar la calculadora.");
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                double sumaA = pedirNumero("Ingrese primer número: ");
                double sumaB = pedirNumero("Ingrese segundo número: ");
                System.out.println("Resultado: " + calculadora.suma(sumaA, sumaB));
                break;
            case 2:
                double restaA = pedirNumero("Ingrese primer número: ");
                double restaB = pedirNumero("Ingrese segundo número: ");
                System.out.println("Resultado: " + calculadora.resta(restaA, restaB));
                break;
            case 3:
                double multA = pedirNumero("Ingrese primer número: ");
                double multB = pedirNumero("Ingrese segundo número: ");
                System.out.println("Resultado: " + calculadora.multiplicacion(multA, multB));
                break;
            case 4:
                double divA = pedirNumero("Ingrese primer número: ");
                double divB = pedirNumero("Ingrese segundo número: ");
                System.out.println("Resultado: " + calculadora.division(divA, divB));
                break;
            case 5:
                int n = (int) pedirNumeroEntero("Ingrese un número entero no negativo para factorial: ");
                System.out.println("Resultado: " + calculadora.factorial(n));
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
        }
    }

    private double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    private int pedirNumeroEntero(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }
}
