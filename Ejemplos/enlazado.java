
import java.util.LinkedList;

public class enlazado {
    public static void main(String[] args) {
        LinkedList<String> correos = new LinkedList<>();
        correos.add("correo1@example.com");
        correos.add("correo2@example.com");
        correos.add("correo3@example.com");
        for (String correo : correos) {
            System.out.println("Reenviado " + "a " + correo);
        }

    }

}
