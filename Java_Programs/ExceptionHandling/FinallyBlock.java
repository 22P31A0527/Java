import java.util.*;
public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = { 1 , 2 , 3 , 4 , 5 };
        System.out.println("Enter the element");
        int ele = sc.nextInt();
        System.out.println("Enter the index at which the element should change");
        int index = sc.nextInt();
        try {
            arr[index] = ele;
            System.out.println("Changed successfully");
        }
        catch(Exception e) {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("program executed successfully");
        }
    }
}
