import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // preguntar por un numero
        System.out.println("Ingresa un numero");
        int input = scanner.nextInt();
        /*
         * 1 si el input es divisible por 2?:
         *
         *       - si si ? es divisible por 3?:
         *           si si - print es divisible por 2 y 3
         *           si no - print es divisible por 2
         *
         * 2 si el input es divisible por 3?:
         *
         *       - si si ? - print es divisible por 3
         *
         * 3 si no defect output
         *
         *       - print solo es divisible por input
         * */
        int divByTwo = input % 2;
        int divByThree = input % 3;

        if (divByTwo == 0){
            String output = divByThree == 0 ? "es divisible por 2 y 3": "es divisible por 2";
            System.out.println(output);
        } else if (divByThree == 0) {
            System.out.println("es divisible por 3");
        } else {
            System.out.println("es divisible solo por si mismo:" + input);
        }
    }
}
