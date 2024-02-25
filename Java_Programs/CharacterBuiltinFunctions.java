import java.lang.Character;
public class CharacterBuiltinFunctions {
    public static void main(String[] args) {
        // changing the data type from character to striing 
        String s1 = ""+'a';
        String s2 = Character.toString('n');
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('z'));
        System.out.println(Character.isLowerCase('Z'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('$'));
        System.out.println(Character.isDigit('1'));
    }
}
