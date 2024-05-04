package RandomClasses;
import java.util.Random;

import javax.xml.transform.Source;
public class RandomClass1 {
    public static void main(String[] args) {
        // generating random numbers is same as reading from console using scanner class
        Random rdmNum = new Random();

        //generate random integer numbers (same for long , it generated between Long.MAX_VALUE & Long.MIN_VALUE)
        int num1 = rdmNum.nextInt();
        System.out.println("Random Integer number : " + num1);
        //generate random double numbers between 0.0 and 1.0 exclusive (same for float )
        double num2 = rdmNum.nextDouble();
        System.out.println("Random Double number :  " + num2);

        //generate boolean value , either true or false
        boolean b = rdmNum.nextBoolean();
        System.out.println("Random boolean value :  " + b);
    }
}
