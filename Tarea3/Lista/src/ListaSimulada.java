import java.util.ArrayList;

public class ListaSimulada {
    private ArrayList<Integer> lista;

    public ListaSimulada() {
        lista = new ArrayList<>();
    }

    public void insertarInicio(int valor) {
        lista.add(0, valor);
    }

    public void insertarFinal(int valor) {
        lista.add(valor);
    }

    public void eliminar(int valor) {
        if (lista.contains(valor)) {
            lista.remove(Integer.valueOf(valor));
            System.out.println("Valor eliminado.");
        } else {
            System.out.println("Valor no encontrado.");
        }
    }

    public boolean buscar(int valor) {
        return lista.contains(valor);
    }

    public void mostrar() {
        if (lista.isEmpty()) {
            System.out.println("Lista vacía.");
        } else {
            System.out.print("Lista: ");
            for (int i = 0; i < lista.size(); i++) {
            if (i < lista.size() - 1) {
                System.out.print(lista.get(i) + " -> ");
            } else {
                System.out.print(lista.get(i));  // último valor sin "->"
            }
        }
        System.out.println();  // salto de línea final
        }
    }
}
