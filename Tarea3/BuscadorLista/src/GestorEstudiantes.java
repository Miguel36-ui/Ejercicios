import java.util.ArrayList;

public class GestorEstudiantes {
    private ArrayList<Estudiante> listaEstudiantes;

    public GestorEstudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante e) {
        listaEstudiantes.add(0, e); // Inserta al inicio
    }

    public boolean eliminarEstudiante(int id) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getId() == id) {
                listaEstudiantes.remove(e);
                return true;
            }
        }
        return false;
    }
    

    public boolean buscarEstudiante(int id) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void vaciarLista() {
        listaEstudiantes.clear();
    }

    public void mostrarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes inscritos.");
            return;
        }

        System.out.println("Lista de estudiantes inscritos:");
        for (Estudiante e : listaEstudiantes) {
            System.out.println("- " + e);
        }
    }
    
}