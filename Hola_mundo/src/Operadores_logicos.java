public class Operadores_logicos {
    public static void main(String[] args) {
        // >, <, >=, <=, ==
        // or --> a || b
        // and --> a && b
        // not --> !a ---> negacion de a, invierte su valor booleano
        boolean a = true;
        boolean b = false;
        System.out.println(!a);// false

        String name = "Marco Rossel";

        boolean check = name.equals("Lushito Perez") || name.equals("Marco Rossel");
        // if check == true ? do something
        System.out.println(check);
    }
}
