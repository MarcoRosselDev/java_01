/* Lista de primitivos en java
byte (number, 1 byte)
short (number, 2 bytes)
int (number, 4 bytes)
long (number, 8 bytes)
float (float number, 4 bytes)
double (float number, 8 bytes)
char (a character, 2 bytes)
boolean (true or false, 1 byte)
 */

public class Main {
    public static void main(String[] args) {
      /* para agregar una variable se deve espesificar el tipo asi: */
      int myNumber = 5; // entero
      double d = 4.5; // numero doble flotante (flotante mas presiso y mas grande que float normal)
      float f = (float) 4.5; // flotante chiquito
      float fc = 4.5f; // la f es una avreviacion de casting float (chiquito abreviado)


      /* los strings no son tan simples */
      char c = 'g';
      // Create a string with a constructor
      String s1 = new String("Who let the dogs out?");        // String object stored in heap memory
      // Just using "" creates a string, so no need to write it the previous way.
      String s2 = "Who who who who!";                         // String literal stored in String pool
      // Java defined the operator + on strings to concatenate:
      String s3 = s1 + s2;


      /* booleanos */
      boolean b = false;
      b = true;

      boolean toBe = false;
      b = toBe || !toBe;
      if (b) {
          System.out.println(toBe);
      }

      int children = 0;
      b = children; // Will not work
      if (children) { // Will not work
          // Will not work
      }
      int a;
      boolean b = true;
      boolean c = false;
      a = b + c;            //The following line will give an error
      System.out.println(a);
    }
