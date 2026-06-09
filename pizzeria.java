import java.util.Scanner;

public class pizzeria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables
        int tipoPizza;
        char ingrediente;
        String ingredienteElegido = "";

        // Menú
        System.out.println("=== Pizzería Bella Napoli ===");
        System.out.println("1. Pizza Vegetariana");
        System.out.println("2. Pizza No Vegetariana");
        System.out.print("Elige el tipo de pizza: ");
        tipoPizza = sc.nextInt();

        // Opciones según el tipo
        if (tipoPizza == 1) {

            System.out.println("Ingredientes vegetarianos:");
            System.out.println("a. Pimiento");
            System.out.println("b. Tofu");
            System.out.print("Elige un ingrediente: ");
            ingrediente = sc.next().charAt(0);

            if (ingrediente == 'a') {
                ingredienteElegido = "Pimiento";
            } else if (ingrediente == 'b') {
                ingredienteElegido = "Tofu";
            } else {
                System.out.println("Ingrediente no válido");
            }

            // Resultado
            System.out.println("\nPizza Vegetariana");
            System.out.println("Ingredientes:");
            System.out.println("- Mozzarella");
            System.out.println("- Tomate");
            System.out.println("- " + ingredienteElegido);

        } else if (tipoPizza == 2) {

            System.out.println("Ingredientes no vegetarianos:");
            System.out.println("a. Peperoni");
            System.out.println("b. Jamón");
            System.out.println("c. Salmón");
            System.out.print("Elige un ingrediente: ");
            ingrediente = sc.next().charAt(0);

            if (ingrediente == 'a') {
                ingredienteElegido = "Peperoni";
            } else if (ingrediente == 'b') {
                ingredienteElegido = "Jamón";
            } else if (ingrediente == 'c') {
                ingredienteElegido = "Salmón";
            } else {
                System.out.println("Ingrediente no válido");
            }

            // Resultado
            System.out.println("\nPizza No Vegetariana");
            System.out.println("Ingredientes:");
            System.out.println("- Mozzarella");
            System.out.println("- Tomate");
            System.out.println("- " + ingredienteElegido);

        } else {
            System.out.println("Tipo de pizza no válido");
        }

        sc.close();
    }
}