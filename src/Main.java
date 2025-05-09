import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clients = new ArrayDeque<>(firstClients);

        while (!clients.isEmpty()) {
            String name = clients.poll();
            System.out.println(name + " сделал новый маникюр.");
            if (Math.random() < 0.5) {
                clients.offer("a friend of " + name);
                System.out.println("+++++++" + name + " пригласила друга");
            } else {
                System.out.println("-------" + name + " не пригласила друга");
            }
        }
    }
}