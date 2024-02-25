public class Strings2 {
    public static void main(String[] args) {
        String s = "Hello World";
        // length() method gives the length of the string
        System.out.println(s.length());

        // accessing the characters
        System.out.println(s.charAt(1));

        // accessing the indices
        System.out.println(s.indexOf('H')); // first occrence index
        System.out.println(s.lastIndexOf('l'));  //last occurance index

        System.out.println(s.startsWith("Hel")); 
        System.out.println(s.endsWith("ld"));

        // returns a new string without changing the original string
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        //contains() method helps to find if the character is present in the string or not , give boolean value
        System.out.println(s.contains(""+'H'));
        System.out.println(s.contains(""+'z'));

        // accessing the substrings ,last index is excluded
        System.out.println(s.substring(7));
        System.out.println(s.substring(1,6));

        // if both the lengths of the strings are not same , then it will return the difference of length
        String p = "abcaaaaa";
        String q = "he";
        System.out.println(p.compareTo(q));

        /*  if both the lengths of the strings are same , then it compare lexicographically 
            if the char of 1st string is greater than 2nd string , then it will give the positive difference
            if the char of 1st string is smaller than 2nd string , then it will give the negative difference
             if the char of 1st string is same as 2nd string , then it will give the zero */ 
        String s1 = "abc";
        String s2 = "abe";
        String s3 = "xyz";
        String s4 = "xyz";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s3.compareTo(s4));

        // it will gives a boolean value
        System.out.println(s3.equals(s4));
    }
}
