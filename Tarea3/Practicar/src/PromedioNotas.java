import java.util.ArrayList;

public class PromedioNotas {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7.3);
        notas.add(10.0);

        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }

        double promedio = suma / notas.size();
        System.out.println("Notas: " + notas);
        System.out.println("Promedio: " + promedio);
    }
}
