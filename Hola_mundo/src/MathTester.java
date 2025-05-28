public class MathTester {
    public static void main(String[] args) {
        // abs = absoluto
        System.out.println(Math.abs(-132)); // 132
        // ceil = redondeo hacia arriba
        System.out.println(Math.ceil(1.00002)); // 2.0
        // floor = redondeo hacia abajo
        System.out.println(Math.floor(19.999));// 19.0
        // retorna el numero mayor
        System.out.println(Math.max(100, 200)); // 200
        // min retorna el numero menor
        System.out.println(Math.min(100, 200)); // 100
        // round = redonde al numero mas cercano
        System.out.println(Math.round(14.5)); // 15
        // random = aleatorio entre 0 y 1
        System.out.println(Math.random()); // 0.4456935529918695
        // numero aleatorio de 0 a 100 eliminando los decimales
        System.out.println((int) (Math.random() * 100)); // 45
    }
}
