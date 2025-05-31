package Loops;

import java.util.Scanner;

public class WhileBreak {
    public static void main(String[] args) {
        // while loop with break and continue option

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Por favor ingresa un comando");
            input = scanner.next().toLowerCase();
            if (input.contains("exit")) {
                System.out.println("comando exit, salir de terminal...");
                break;
            }

            if (input.contains("continue")) {
                continue;
            }
            System.out.println("esto se ejecuta en cada loop a no ser que ingreses el comando continue, comando actual...:: " + input);
        }
        System.out.println("esto se imprime si ya estas fuera del loop : " + input);
    }
}

// practicar el while con break and continue en javascript y c++