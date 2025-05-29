import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*
        * Scanner inputScan = new Scanner(System.in);
        * System.out.println("Ingresa tu edad");
        * byte edad = inputScan.nextByte();
        * System.out.println("Tu edad es :");
        * System.out.println(edad);*/

        /*
        * Crear una calculadora que reciba
        * 2 numeros y luego imprima el resultado de la suma
        * de estos dos numeros
        * */
        Scanner scanner = new Scanner(System.in);
        // mensaje 1: solicitar valor numerico 1
        System.out.println("Hola, ingresa un numero");
        int valor1 = scanner.nextInt();
        // mensaje 2: solicitar valor numerico 2
        System.out.println("ingresa otro numero para sumarlos");
        int valor2 = scanner.nextInt();
        // mensaje 3: retornar la suma
        System.out.println("genial, la suma de estos numeros es:");
        System.out.println(valor1 + valor2);
    }
}