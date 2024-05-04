package ExceptionHandling;
import java.lang.reflect.Method;
class Example {
    public static void printArray(String[] arr) {
        for(String s : arr) {
            System.out.println(s);
        }
    }
    public static void printArray(Integer[] arr) {
        for(Integer n : arr) {
            System.out.println(n);
        }
    }
    public static void printArray(Double[] arr) {
        for(Double d : arr) {
            System.out.println(d);
        }
    }
}
public class UnCheckedExceptions {
    public static void main(String[] args) {
        Method[] methods = Example.class.getDeclaredMethods();
        int cnt = 0;
        for(Method m : methods) {
            if(m.getName().equals("printArray")) cnt++;
        }
        if(cnt > 1) {
            throw new RuntimeException("Don't use method overloading");
        }
        // String[] arr1 = {"Hello" , "world" };
        // Integer[] arr2 = {1 ,2 , 3};
        // Double[]  arr3 = {1.2 ,3.5 , 9.0 , 8.8 , 5.55};
        // Example.printArray(arr1);
        // Example.printArray(arr2);
        // Example.printArray(arr3);
    }
}
