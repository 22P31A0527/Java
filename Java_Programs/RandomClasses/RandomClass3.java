package RandomClasses;
import java.lang.Math;
import java.util.Random;
public class RandomClass3 {
    public static void main(String[] args) {
        //how many times you run the program same number sequence is generated
        //obtaining a random sequence by using a seed 
        //use of seed : generating the same sequence for multiple times
        Random rand = new Random(20L);
        System.out.println("1st random number : " + rand.nextInt());
        System.out.println("2nd random number : " + rand.nextInt());
        rand.setSeed(5L);
        System.out.println("3rd random number : " + rand.nextInt());
        System.out.println("4th random number : " + rand.nextInt());
        System.out.println("5th random number : " + rand.nextInt());

        // java.lang.Math.random() method is also used for the same purpose inplace of util.Random class 
        // random() method generates between 0.0 to 1.0
        System.out.println(Math.random());
    }
}
