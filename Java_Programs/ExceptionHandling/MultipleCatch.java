import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , m ;
        System.out.println("Enter n and m values");
        n = sc.nextInt();
        m = sc.nextInt();
        try {
            int c = n/m;
            System.out.println(c);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Index out of range exception");
        }
        catch(ArithmeticException e) {
            System.out.println("Arithematic exception caused");
        }
        catch(NumberFormatException e) {
            System.out.println("Number format exception caused");
        }
    }
}
