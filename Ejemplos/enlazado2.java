import java.util.LinkedList;

public class enlazado2 {
    public static void main(String[] args) {
        LinkedList<String> solicitudes = new LinkedList<>();
        solicitudes.add("Miguel Tress");
        solicitudes.add("Pedro Diaz");
        solicitudes.add("Usiel Trujillo");
        for (String solicitud : solicitudes) {
            System.out.println("Se envio solicitud a " + solicitud);

        }
    }

}
