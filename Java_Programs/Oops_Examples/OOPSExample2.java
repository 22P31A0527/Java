class Rectangle
{
    double length , breadth ;
    void printArea(){
        System.out.println(length * breadth);
    }
    void printPerimeter(){
        System.out.println(2 * ( length + breadth));
    }
}
public class OOPSExample2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10.5;
        r1.breadth = 59.0;
        r1.printArea();
        r1.printPerimeter();

        Rectangle r2 = new Rectangle();
        r2.length = 2.44;
        r2.breadth = 6.89;
        r2.printArea();
        r2.printPerimeter();
    }
}
