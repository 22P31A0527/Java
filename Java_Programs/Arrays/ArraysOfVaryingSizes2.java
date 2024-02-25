import java.util.*;
public class ArraysOfVaryingSizes2 {
    public static void main(String[] args) {
        //declaring the 2d arrays with 3 size (of 3 rows)
        int[][] arr = new int[3][];

        //declaring the each array in 2d arrays with varying sizes
        arr[0] = new int[2];
        arr[1] = new int[5];
        arr[2] = new int[7];

        //assigning the values 
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = i;
            }
        }
        System.out.println(Arrays.deepToString(arr)); 
    }
}
