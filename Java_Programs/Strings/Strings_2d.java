import java.util.Arrays;

public class Strings_2d {
    public static void main(String[] args)
    {
        String[][] characters = {{"harry","hermoine","ron"},
                                 {"ntr","alia","ramcharan"},
                                 {"anju","divya","harika"}};
        //to print each string from set of 2d strings
        for(String[] eachSeries : characters)
        {
            for(String eachchar : eachSeries)
            {
                System.out.println(eachchar);
            }
        }
    }
}
