class Constructor1{
    // default constructor : we cant pass any parameter , it is a special method to initialize the values
    Constructor1(){ 
        System.out.println("constructor is invoaked");
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
    }
}
