import java.util.ArrayList;

public class GestorEstudiantes {
    private ArrayList<Estudiante> lista;

    public GestorEstudiantes() {
        lista = new ArrayList<>();
    }

    public void insertarEstudiante(String nombre, double promedio) {
        lista.add(new Estudiante(nombre, promedio));
        System.out.println("Estudiante agregado.");
    }

    public void mostrarEstudiantes() {
        if (lista.isEmpty()) {
            System.out.println("Lista vacía.");
            return;
        }

        System.out.println("Lista de estudiantes:");
        for (Estudiante e : lista) {
            System.out.println(e);
        }
    }

    public boolean buscarEstudiante(String nombre) {
        for (Estudiante e : lista) {
            if (e.nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado: " + e);
                return true;
            }
        }
        System.out.println("Estudiante no encontrado.");
        return false;
    }

    public void eliminarEstudiante(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).nombre.equalsIgnoreCase(nombre)) {
                lista.remove(i);
                System.out.println("Estudiante eliminado.");
                return;
            }
        }
        System.out.println("No se encontró al estudiante.");
    }
}