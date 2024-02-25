import java.util.*;
public class ArraysareObjects {
    public static void main(String[] args)
    {
        /*Object class : it belongs to lang package where as lang package is a default package in java .
                    object class is an elder class , each object we created is explicitily belongs to object class*/ 
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println(sc instanceof Scanner);
        System.out.println(sc instanceof Object);
        System.out.println(arr instanceof Object);
    }
}
