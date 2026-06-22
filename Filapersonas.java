import java.util.LinkedList;
import java.util.Queue;

public class Filapersonas {
    public static void main(String[] args) {
        
        Queue<String> Fila = new LinkedList<>();

        Fila.offer("Brahayan");
        Fila.offer("Mario");
        Fila.offer("Flor");
        Fila.offer("Jose");
        Fila.offer("Ronaldo");

        System.out.println("Fila inicial: " + Fila);
        
        System.out.println("Persona al frente: " + Fila.peek());
        
        System.out.println("Atendiento a: " + Fila.poll());
        System.out.println("Atendiento a: " + Fila.poll());
        
        System.out.println("Fila restande: " + Fila);
    }
}