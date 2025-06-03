import java.util.Stack;

public class PilaDemo {
    public static void main(String[] args) {
        Stack <String> auto= new Stack<>();
        auto.push("Auto 3");
        auto.push("Auto 2");
        auto.push("Auto 1");

        while (!auto.isEmpty()) {
            System.out.println("Aspirando: " + auto.pop());
            
        }

    }
    
}
