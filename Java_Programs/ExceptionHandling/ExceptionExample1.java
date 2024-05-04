package ExceptionHandling;
public class ExceptionExample1 {
    public static void main(String args[]) {
        try {
            System.out.println(10 / 0);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        
        System.out.println("I am in the last line");
    }
}
