import java.util.LinkedList;
import java.util.Queue;

public class ColaDemo {
public static void main(String[] args) {
    Queue<String>fila= new LinkedList<>();
    fila.add ("Cliente 1");
    fila.add ("Cliente 2");
    fila.add ("Cliente 3");

    while (!fila.isEmpty()) {
        //System.out.println("Atendiendo: " + fila.poll());
        System.out.println("Atendiendo: " + fila);
        
    }
}
    
}
