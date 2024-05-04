package ExceptionHandling;
import java.lang.Exception;
public class ExampleOfThrows2 {
    //Connection con;
    static int val;
    public static void method2(int n , int m)  throws Exception {
        val = n/m;
    }
    public static void method1(int n , int m) {
        try{
            method2(n , m );
        }
        catch(Exception e) {
            System.out.println(e);
        }    
    }
    public static void main(String[] args) {
        method1(10 , 0);
    }
}
