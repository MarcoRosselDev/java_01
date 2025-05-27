//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte miEdad = 31;
        int numeroGrande = 2147483647; // maximo
        float edad = 15.5F;
        boolean soltero = true;
        char curso = 'a';
        System.out.println("Hola mundo !, mi edad es :" + miEdad);
        System.out.println(numeroGrande);
        System.out.println(edad);
        System.out.println(soltero);
        System.out.println(curso);


        String texto = new String("Hola mundo");
        // forma compacta
        String textoAbreviado = "Hola mundo";

        int cambioDeTexto = texto.length();
        System.out.println(texto);
        System.out.println(textoAbreviado);
        System.out.println(cambioDeTexto);
    }
}