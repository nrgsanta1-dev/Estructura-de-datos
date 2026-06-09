import java.util.Scanner;
public class numeros  {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Ingrese un número: ");
            Scanner Scanner = new Scanner(System.in);
            int numeros = Scanner.nextInt();

            if (esPrimo(numeros)) {
                System.out.println(numeros + " es un número primo.");
            } else {
                System.out.println(numeros + " no es un número primo.");
                System.out.println("Numeros primos del 1 al 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
            }
        }
    }
    public static boolean esPrimo(int numeros) {
        if (numeros <= 1) {
            return false;


            
        }
        for (int i = 2; i <= Math.sqrt(numeros); i++) {
            if (numeros % i == 0) {
                return false;
            }
        }
        return true;
    }
}

