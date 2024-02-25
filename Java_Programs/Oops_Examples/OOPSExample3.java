class Circle
{
    // static variable : no need to create any object to access the variable , directly we can call the variable
    // final is used that we can't change the value it is the final one  
    static final double PI = 3.14;
    double radius;
    public void printDiameter(){
        System.out.println(2 * radius);
    }
    void printArea(){
        System.out.println(PI * Math.pow(radius,2));
    }
    void printPerimeter(){
        System.out.println(2 * PI * radius);
    }
}
public class OOPSExample3 {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        obj1.radius = 6.9;
        obj1.printDiameter();
        obj1.printArea();
        obj1.printPerimeter();
    }
}
