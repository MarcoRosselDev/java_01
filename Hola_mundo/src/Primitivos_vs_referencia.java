import java.awt.*;

public class Primitivos_vs_referencia {
    public static void main(String[] args) {
        // caso primitivo
        int a = 5;
        int b = a;
        b = 21;
        System.out.println(a); // 15

        // ahora lo mismo pero con referencia
        Point punto1 = new Point();
        Point punto2 = punto1;
        punto2.x = 23;
        System.out.println(punto1); // java.awt.Point[x=23,y=0]
        // altero el punto1 de referencia !

        // los string no se comportan asi.
        String text1 = "Hola Mundo";
        String text2 = text1;
        String textUpp = text1.toUpperCase();
        System.out.println(text1); // Hola Mundo ---> no altero el texto de referencia
        // esto significa que se crea una nueva instancia cada vez que referenciamos un string.
        System.out.println(textUpp); // HOLA MUNDO
    }
}
