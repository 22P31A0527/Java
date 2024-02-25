import java.util.*;
public class two_dimentional_arrays {
    public static void main(String[] args) {
        int[][]  marks = {{10 , 20 , 30} , {40 , 50 , 60}};

        //accessing the first row in the 2d array
        //Arrays class is present at util package
        System.out.println(Arrays.toString(marks[0]));

        //accessing the 2d array elements
        for(int i=0 ; i<2 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }

        //creating 2d array with user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns");
        int rows = sc.nextInt(); //no.of rows
        int columns = sc.nextInt();  //no.of columns
        //creating the array
        int[][] arr = new int[rows][columns];
        //initialising the elements of array
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<columns ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //printing normally
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<columns ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        //printing using for each on 2d array
        for (int[] eachArray : arr) {
            for(int eachLine : eachArray){
                System.out.print(eachLine+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
