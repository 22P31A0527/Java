import java.util.Arrays;
public class Strings3 {
    public static void main(String[] args) {
        /* Strings are immutable : can't be changed after declaration
         * arrays are mutalbe : can be changed  */

        String s = "hello";
        // change the string into character array
        char[]  arr = s.toCharArray();
        // sort using the sort() method in Arrays class
        Arrays.sort(arr);
        // convert the character array into string
        //new String (char array)
        String sortedString = new String(arr);
        System.out.println(sortedString);
    }
}
