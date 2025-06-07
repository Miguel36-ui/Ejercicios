public class Estudiante {
    String nombre;
    double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Promedio: " + promedio;
    }
}
