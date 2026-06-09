import java.util.Scanner;

public class factorial {

    public static int factorial (int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        int resultado = factorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);

        scanner.close();
    }
}