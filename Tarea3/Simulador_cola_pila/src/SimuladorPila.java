import java.util.Stack;

public class SimuladorPila {
    private Stack<String> pilaArchivos;

    public SimuladorPila() {
        pilaArchivos = new Stack<>();
    }

    public void abrirArchivo(String nombreArchivo) {
        pilaArchivos.push(nombreArchivo);
        System.out.println("Archivo \"" + nombreArchivo + "\" abierto.");
    }

    public void cerrarArchivo() {
        if (!pilaArchivos.isEmpty()) {
            String archivoCerrado = pilaArchivos.pop();
            System.out.println("Archivo \"" + archivoCerrado + "\" cerrado.");
        } else {
            System.out.println("No hay archivos abiertos para cerrar.");
        }
    }

    public void mostrarArchivosAbiertos() {
        if (pilaArchivos.isEmpty()) {
            System.out.println("No hay archivos abiertos.");
        } else {
            System.out.println("Archivos abiertos actualmente:");
            for (int i = pilaArchivos.size() - 1; i >= 0; i--) {
                System.out.println("- " + pilaArchivos.get(i));
            }
        }
    }
}
