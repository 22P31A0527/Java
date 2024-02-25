class Overload
{
    String name ;
    int age ;
    String branch ;
    double cgpa ;
    Overload() {}
    Overload(String n ){
        name = n;
        System.out.println((char)10);
    }
    Overload(String n , double c){
        name = n ;
        cgpa = c;
    }
    Overload(String n , int a){
        name = n; 
        age = a;
    }
    Overload(String n , int a , double c){
        name = n;
        age = a;
        cgpa = c;
    }
    Overload(String n , int a , String b , double c){
        name = n;
        age = a;
        branch = b;
        cgpa = c;
    }
}
public class OverloadedConstructors {
    public static void main(String args[]){
        Overload o1 = new Overload();
        Overload o2 = new Overload("Anju");
        Overload o3 = new Overload("Subbu",90);
        Overload o4 = new Overload("Ammu",19,9.56);
        Overload o5 = new Overload("Mouni",19 , "cse",9.55);
        Overload o6 = new Overload("Hema",9.52);
    }
}
