/**
 * array_introduction
 */
import java.util.Arrays;
import java.util.Scanner;
public class array_introduction {

    public static void main(String[] args)
    {
        //Initialising the array at the compile time
        int[] arr = {10 , 20 , 30 , 40 , 50};
        //length is the variable that is used to get the length of the array 
        System.out.println(arr.length);  
        //accessing the arrays
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
         System.out.printf("\n\n");


        //intialsising at the runtime
        //creating a scanner class to read the input from the user
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();  
        //creating the array of specific size 
        int [] arr1 = new int[n];
        System.out.println("enter the values of array : ");
        //reading the input from user
        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++ ){
            System.out.print(arr1[i]+" ");
        }
        sc.close();

        //copy the values from one array to another array
        int[]  p = {1 , 2 , 3};
        int[]  q = p.clone();
        p[0] = 50;
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(q));

    }
}