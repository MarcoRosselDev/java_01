# Variables y tipos de datos primitivos

solo estos 8 tipos de datos son primitivos,  
los string son tratados como referencias.

sout | System.out.println();

### numeros:

|nombre |rango de digitos| espacio en memoria | max|
|-------|----------------|--------------------|----|
|byte | +-128 | 1 byte|
|short | +-32768 | 2 bytes|
|int | +- 2 mil millones | 4 bytes|2147483647|
|long | +- 9x0^16 | 8 bytes|

****

### lista de datos primitivos:

enteros:
  - int
  - byte
  - short
  - long  

decimales:  
Los doubles ocupan el doble de memoria que los floats (de ahí el nombre), pero como resultado son más precisos y pueden representar un rango de valores más amplio

| nombre | declaracion                               |
|--------|-------------------------------------------|
| float  | float edad = 15.5F; o float edad = 15.5f; |
| double | double edad = 15.5f;                      |

boolean:  
  - true
  - false

char:  
no se puede utilizar comillas dobles
  - a (solo un caracter, like = 'a')

****

# Strings
Los string no se alteran, son inmutables, por lo que si a una variable x le aplico algun metodo de strings no se alterara x sino que retornara uno nuevo que deveremos almacenar en otra variable.

```java
// forma estandar
String texto = new String("Hola mundo");
// forma compacta
String textoAbreviado = "Hola mundo";
// para escapar caracteres especiale con \:
String texto = "C:\\url\\\"some random text\"";
// output:
// C:\url\"some random text"
String texto = "Hola \n Mundo"; // salto de linea
String texto = "Hola \tMundo"; // tabulacion
```

****

# Arrays

sintaxis (array de numeros):  
int[  ] \<nombreX> = new int[\<cantidad de items>]
System.out.println(nombreX); <---- retorna la direccion en memoria

```java
int[][] myArray = {{0,1},{2,3}};
System.out.println(Arrays.toString(myArray));
// [[I@27716f4, [I@8efb846]
System.out.println(Arrays.deepToString(myArray));
// [[0, 1], [2, 3]]
int[][] twoxthree = new int[2][3];
// [[0, 0, 0], [0, 0, 0]]
twoxthree[0][0] = 31;
twoxthree[1][2] = 13;
System.out.println(Arrays.deepToString(twoxthree));

```
****

# constantes

```java
final String name = "Hola";
name = "Mundo"; // esto va a lanzar un error y no se podra ejecutar el programa.
```
