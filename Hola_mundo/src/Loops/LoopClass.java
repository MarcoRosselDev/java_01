package Loops;

import java.util.Scanner;

public class LoopClass {
    public static void main(String[] args) {
        // for
        byte length = 2;
        for (int i = 0; i < length ; i++) {
            System.out.println(i + "for test");
        }
        // while
        byte w = 0;
        while (w < 2) {
            System.out.println(w + "while test");
            w++;
        }

        // while loop example
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.contains("exit")) {
            System.out.println("seguir ejecutando el loop");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        System.out.println("saliste de el loop");

        // do while
        /* la diferencia es que se ejecutara si o si la primera vez,
        *   independiente de si se cumple o no la condicion
        *
        *   do {
        *       logica
        *   } while (condicion);
        *
        * */

    }
}