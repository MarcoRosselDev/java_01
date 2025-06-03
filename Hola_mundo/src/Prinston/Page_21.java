package Prinston;

public class Page_21 {
    static public void main(String[] args) {
        int[] a = {1,2,3,4,5};

        // suma de elementos int de un array
        System.out.println(suma(a)); // 15.0
        // promedio
        System.out.println(promerdio(a)); // 3.0
        // compia de array
        System.out.println(java.util.Arrays.toString(copia_array(a)));
        double[] b = copia_array(a);
        // inversion de array
        //System.out.println(inversion_array(b));
        inversion_array(b);
        multiplicacion_matiz_matriz();
    }
    static double[] copia_array(int[] a) {
        int H = a.length;
        double[] b = new double[H];
        for (int i = 0; i < H; i++)
            b[i] = a[i];


        System.out.println(b); // [D@27716f4
        return b;
        //return java.util.Arrays.toString(b); // [1.0, 2.0, 3.0, 4.0, 5.0]
    }
    static double suma(int[] a) {
        int N = a.length;
        double sum = 0.0;
        // for (int j : a) sum += j; <-------- es = for
        for (int i = 0; i < N; i++)
            sum += a[i];

        return sum;
    }
    static double promerdio(int[] a) {
        return suma(a) / a.length;
    }
    static void inversion_array(double[] array){
        double[] a = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
        int N = a.length;
        for (int i = 0; i < N/2; i++)
        {
            double temp = a[i];
            a[i] = a[N-1-i];
            a[N-i-1] = temp;
        }
        System.out.println(java.util.Arrays.toString(a)); // [5.0, 4.0, 3.0, 2.0, 1.0]
    }
    static void multiplicacion_matiz_matriz() {
        // primero creamos una matiz de 3x3 M,N
        /*
        int M = 2;
        int N = 2;
        double[][] a = new double[M][N]; // pagina 20
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = 0.0;
            }
        }*/
        int[][] matriz_a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz_b = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //System.out.println(java.util.Arrays.toString(a)); ---------> no imprime nada
        // multiplicacion de matiz MxN
        imprimirMatriz(matriz_a);
        System.out.println(matriz_a.length);

        int N = matriz_a.length;
        int[][] c = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            { // Compute dot product of row i and column j.
                for (int k = 0; k < N; k++)
                    c[i][j] += matriz_a[i][k]*matriz_b[k][j];
                    //c[i][j] += matriz[i][k];
            }
        // not entiendo por ahora la multiplicacion de matrizes
        imprimirMatriz(c);
    }
    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;

        if (filas > 0) {
            int columnas = matriz[0].length; // Asumimos que todas las filas tienen la misma cantidad de columnas
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(); // Salto de línea al final de cada fila
            }
        } else {
            System.out.println("La matriz está vacía.");
        }
    }
}
