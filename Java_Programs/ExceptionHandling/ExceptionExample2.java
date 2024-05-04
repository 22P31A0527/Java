package ExceptionHandling;

public class ExceptionExample2 {
    public static void main(String[] args) {
       try {
          int[] arr = {10 , 20};
          System.out.println(arr[2]);
       }
       catch(IndexOutOfBoundsException e) {
        System.out.println(e);
       }
       finally {
        System.out.println("Exception happend");
       }
    }
}
