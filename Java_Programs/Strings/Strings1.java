public class Strings1 {
    public static void main(String[] args) {
        // see  the below description
        /*  if we create the variables in this form , the instances are stored in scp in the heap memory 
            in this , it stores the "Hello" as a single instance which points from both x and y
            both points to the same location*/
        String x = "Hello";
        String y = "Hello";
        System.out.println(x == y);

        /* if we create the variables in this form , then the instances are stored in heap memory , 
         * it doesn't store as a single instance , it stores as multiple instances , 
         * both are pointing to different locations
         */
        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(a == b);
    }
}
/*  objects or variables are stored in stack memory 
    instances or values are stored in heap memory
*/