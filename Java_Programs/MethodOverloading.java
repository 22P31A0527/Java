import java.util.*;
public class MethodOverloading {
    // add method taking two int parameters
    static void add(int a , int b){
        System.out.println(a + b);
    }
    //add method taking three int parameters
    static void add(int a , int b ,int c){
        System.out.println(a + b + c);
    }
    // add method taking two double type parameters
    static void add(double a , double b){
        System.out.println(a+b);
    }
    // adding an array of integers
    static void add(int[] arr , int n){
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add( 10 , 20 );
        add(40 , 50 , 60);
        add( 34.60 , 23.80);
        int[] arr = {4 , 5, 10 , 4 , 7};
        add(arr , arr.length);

        //creating the array in the method call itself
        add(new int[]{1,2,3,4},4);
    }
}
/*
Method overloading :  it allows you to create mulitple methods with the same name but with different 
      implementations . it can vary from no..of parameters and data type of parameters , but the return must 
      be same for all the methods which are overloaded .
*/