public class saludo {
    public static void saludo () {
        System.out.println("Hola amigo");
    }
    public static void saludo (String nombre){
        System.out.println("Hola  " + nombre);
    }
    public static void main(String[] args) {
    
        saludo();
        saludo("Brahayan Cruz");
    }
}