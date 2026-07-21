import java.util.Scanner;

public class PrincipalListaDoble {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        int opcion;
        String dato, nuevoDato;

        do {

            System.out.println("\n===== MENÚ LISTA DOBLEMENTE ENLAZADA =====");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Eliminar");
            System.out.println("4. Buscar");
            System.out.println("5. Actualizar");
            System.out.println("6. Mostrar lista");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el dato: ");
                    dato = teclado.nextLine();
                    lista.agregarInicio(dato);
                    break;

                case 2:
                    System.out.print("Ingrese el dato: ");
                    dato = teclado.nextLine();
                    lista.agregarFinal(dato);
                    break;

                case 3:
                    System.out.print("Dato a eliminar: ");
                    dato = teclado.nextLine();

                    if (lista.eliminar(dato))
                        System.out.println("Nodo eliminado.");
                    else
                        System.out.println("Nodo no encontrado.");

                    break;

                case 4:
                    System.out.print("Dato a buscar: ");
                    dato = teclado.nextLine();

                    if (lista.buscar(dato))
                        System.out.println("Nodo encontrado.");
                    else
                        System.out.println("Nodo no existe.");

                    break;

                case 5:
                    System.out.print("Dato anterior: ");
                    dato = teclado.nextLine();

                    System.out.print("Nuevo dato: ");
                    nuevoDato = teclado.nextLine();

                    if (lista.actualizar(dato, nuevoDato))
                        System.out.println("Nodo actualizado.");
                    else
                        System.out.println("Nodo no encontrado.");

                    break;

                case 6:
                    lista.mostrar();
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);

        teclado.close();
    }
}