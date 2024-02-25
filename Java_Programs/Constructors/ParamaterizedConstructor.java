class Constructor2{
    String name , branch , college;
    int age ;
    double cgpa;
    Constructor2(String n , int a ,String b , String cl , double c){
        name = n;
        age = a;
        branch = b;
        college = cl;
        cgpa = c;
        System.out.println("Initialized successfully");
    }
    
}
public class ParamaterizedConstructor {
    public static void main(String[] args) {
        Constructor2 c2 = new Constructor2("Anju", 19, "cse", "acet", 8.5);
    }
}
