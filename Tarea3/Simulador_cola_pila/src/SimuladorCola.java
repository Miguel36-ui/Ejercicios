import java.util.LinkedList;
import java.util.Queue;

public class SimuladorCola {
    private Queue<String> colaClientes;

    public SimuladorCola() {
        colaClientes = new LinkedList<>();
    }

    public void nuevoCliente(String nombre) {
        colaClientes.add(nombre);
        System.out.println("Cliente \"" + nombre + "\" añadido a la cola.");
    }

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            String clienteAtendido = colaClientes.poll();
            System.out.println("Cliente \"" + clienteAtendido + "\" atendido.");
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }

    public void mostrarCola() {
        if (colaClientes.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Clientes en espera:");
            for (String cliente : colaClientes) {
                System.out.println("- " + cliente);
            }
        }
    }
}
