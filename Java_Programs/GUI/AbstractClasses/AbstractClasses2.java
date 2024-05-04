package AbstractClasses;
import java.util.Scanner;
//Abstract Class
abstract class Shape{
    Scanner sc = new Scanner(System.in);
    double area ;
    //Abstract Methods 
    abstract void takeInput();
    abstract void calculateArea();

    //Concrete Methods : These methods contain body
    void displayArea(){
        System.out.println(area);
    }
}
class Square extends Shape{
    double side;
    void takeInput(){
        side = sc.nextDouble();
    }
    void calculateArea(){
        area = side * side;
    }
}
class Rectangle extends Shape{
    double len , wid;
    void takeInput(){
        len = sc.nextDouble();
        wid = sc.nextDouble();
    }
    void calculateArea(){
        area = len * wid;
    }
}
public class AbstractClasses2 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.takeInput();
        sq.calculateArea();
        sq.displayArea();
        Rectangle re = new Rectangle();
        re.takeInput();
        re.calculateArea();
        re.displayArea();
    }
}
