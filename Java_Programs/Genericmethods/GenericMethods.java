class Catsof
{
    String name;
    int age;
    Catsof(){};
    Catsof(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return "This is "+name+"(age is "+age+")";
    }
}
public class  GenericMethods{
    static <T> void printArrays(T[] arr)
    {
        for(T val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //int n =10;
        /*Integer arr1[]={10,20,30,400};
        printArrays(arr1);
        Catsof c1[]={new Catsof("Ram",18),new Catsof("mad",18)};
        printArrays(c1);
        Character arr2[]={'H','e','m','a'};
        printArrays(arr2);
        Float arr3[]={1.5F,2.3F,4.4F};  //F is given to convert double to float
        printArrays(arr3);*/
        //<T> ig given to take the default datatype of the which is passed in printArrays method
    }
}
