package RandomClasses;
import java.util.Random;
public class RandomClass2 {
    public static void main(String[] args) {
        Random rdmNum = new Random();
        // generating random number from 0 to maxvalue exclusively by using syntax nextInt(maxvalue)
        // it generates from 0 to 15 exclusive
        int num1 = rdmNum.nextInt(15);
        System.out.println("Number from 0 to 15  : " + num1);

        // picking the numbers from 5 to 40 
        // substract the starting limit number (5) from upper limit (40) & add 1 to it (40-5+1 = 36)
        // and starting should be added to the result
        int num2 = rdmNum.nextInt(36) + 5;
        System.out.println("Number between 5 to 40 : " + num2);
    }
}
