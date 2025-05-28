public class ConvercioDeTipos {
    public static void main(String[] args) {
        // conversion implicita
        byte a = 1;
        int b = 12;
        // sumar los dos tipos distintos
        int c = a + b; // java toma el tipo de dato mas alto y convierte el resultado a este
        System.out.println(c);

        // conversion explicita
        int x = 12;
        double y = 3.1234;
        // int z = x + y; ---> lanza error
        //double z = x + y; ---> esto esta bien pero que pasa si queremos un int?
        int z = (int) (x + y);
        System.out.println(z);

        // que tal si solo quiero convertir un solo numero?
        int w = x + (int) y;
        System.out.println(w);

        // conversion de un string a double
        String text = "3.4";
        double j = 3 + Double.parseDouble(text);
        System.out.println(j);
        // esto aplica para todos los tipos de numero
        // int --> Integer.parseInt(text);
        System.out.println(Integer.parseInt("1232222") + 123);
    }

}
