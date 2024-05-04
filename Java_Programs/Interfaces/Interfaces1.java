interface Operations {
    //every method you creaate is by-default public and abstract
    int factorial(int n);
}
class Math1 implements Operations {
    public int factorial(int n) {   // using iterative
        int f = 1;
        for(int i = 2 ; i <= n ; i++) {  
            f = f*i;
        }
        return f;
    }
}
class Math2 implements Operations {
    public int factorial(int n) {   //using recursive
        if(n == 1)  return 1;
        return n * factorial(n-1);
    }
}
public class Interfaces1 {
    public static void main(String args[]) {
        Math1 m1 = new Math1();
        System.out.println(m1.factorial(5));
        Math2 m2 = new Math2();
        System.out.println(m2.factorial(5));
    }
}


/*
 * you can achieve 100% abstraction , using interfaces
 * java doesn't support multiple inheritance using classes
 * inheritances support multiple-inheritance
 * inheritances contains only abstract methods
 * you need to write only the declaration of the method in the interfaces
 * classes can implement interfaces using ' implements' keyword
 * the clases that implements an interface should provide the definition of the methods that are decalred in the interface
 * By default , every method in na interface is abstract and public . so we have to make sure ,
 * we give the same access level for the method while implementing in the class that uses the interface.
 * 
 */