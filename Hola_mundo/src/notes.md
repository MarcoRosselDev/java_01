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

```java
// forma estandar
String texto = new String("Hola mundo");
// forma compacta
String textoAbreviado = "Hola mundo";
```