interface Inf1 {
    void method1();
    void show();
}
interface Inf2 {
    void show();
    void method2();
}
class ABC implements Inf1 , Inf2 {
    public void show() {
        System.out.println("Show method");
    }
    public void method1() { 
        System.out.println("Method1 called");
    }
    public void method2() {
        System.out.println("Method2 called");
    }
}
public class Interfaces2 {
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.show();
        obj.method1();
        obj.method2();
    }
}
