import java.util.Scanner;

public class Ejercicio_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        whileLoop : while (true) {
            System.out.println("escoge una opcion:");
            System.out.println("1: Calculadora");
            System.out.println("2: Hackear al pentagono");
            System.out.println("3: salir");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 :
                    System.out.println("Calculadora");
                    System.out.println("ingresa un numero");
                    int a = scanner.nextInt();
                    System.out.println("ingresa otro numero");
                    int b = scanner.nextInt();
                    System.out.println("La suma de " + a + " + " + b + " es: " + (a + b));
                    break;
                case 2 :
                    for (int i = 0; i <= 7; i++) {
                        String out = "#".repeat(i);
                        System.out.println(out);
                    }
                    break;
                case 3:
                    break whileLoop;
                default:
                    System.out.println("ingreza una opcion valida");
                    break;
            }
        }
    }
}
