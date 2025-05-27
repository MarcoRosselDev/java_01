import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        /*
        * int[] miArray = new int[7];
        * System.out.println(miArray);
        * [I@27716f4
        * System.out.println(Arrays.toString(miArray));
        * [0, 0, 0, 0, 0, 0, 0]
        */



        // Arrays de multiples dimenciones
        /*
        * int[] miArrayCorto = {1,4,6,2,4};
        * miArrayCorto[3] = 907;
        * System.out.println(Arrays.toString(miArrayCorto));
        **/
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
    }
}
