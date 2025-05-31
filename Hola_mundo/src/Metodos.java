import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        miMetodo();
        otroMetodo();
        printNombre(nombreUsuario(), edadUsuario());
    }
    static void miMetodo(){
        System.out.println("Hola compare");
    }
    static  void otroMetodo() {
        System.out.println("que pahoooo");
    }
    // este metodo va a resivir parametros
    static void printNombre(String nombre, int edad) {
        System.out.println("Hola, buenos dias " + nombre + " , tu edad es :" + edad);
    }
    // este metodo va a retornar un entero
    static int edadUsuario() {
        System.out.println("por favor escribe tu edad");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        return edad;
    }
    static String nombreUsuario() {
        System.out.println("por favor escribe tu nombre");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        return nombre;
    }
}
