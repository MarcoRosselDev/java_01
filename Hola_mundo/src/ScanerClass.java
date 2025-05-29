import java.util.Scanner;

public class ScanerClass {
    public static void main(String[] args) {
        // Scanner resive inputs por consola al ejecutar el programa
        // devemos espesificar desde donde resive el input
        Scanner inputScan = new Scanner(System.in);
        //String valor = i.next(); // solo retorna la primera palabra de un sttring
        // para solucionarlo aplicamos nextLine
        //String valor = i.nextLine();
        System.out.println("Ingresa tu edad");
        byte edad = inputScan.nextByte();
        System.out.println("Tu edad es :");
        System.out.println(edad);
    }
}
