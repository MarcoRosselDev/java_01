public class aritmeticaBasica {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a / b); // solo retorna 1 (5 /3 = 1.something)
        // Punto flotante (declarar el numerador y divisor con f o F)
        float divF = 10f / 3f ; // si no aplico f se retornara solo 3.0
        System.out.println(divF); // 3.3333333
        // Multiplicacion
        System.out.println(5 * 2); // 10
        // Modulo
        System.out.println(10 % 3); //


        // ++
        int c = 5;
        int d = c++;
        /*
        * Diferencias entre ++5 y 5++
        * ++5 ---> primero suma 1 a 5 y luego lo retorna
        * 5++ ---> primero retorna 5 y luego lo suma
        * */
        System.out.println(c); // 6
        System.out.println(d); // 6

    }
}
