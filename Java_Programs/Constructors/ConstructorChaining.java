class ConstructChain
{
    String name , college , branch;
    ConstructChain(String name){
        this.name = name;
    }
    ConstructChain(String name , String college){
        this(name);    //chaining the constructor
        this.college = college;
    }
    ConstructChain(String name , String college , String branch){
        this(name , college);
        this.branch = branch;
    }
}
public class ConstructorChaining {
    public static void main(String args[])
    {
        ConstructChain c = new ConstructChain("Anju" , "acet" , "cse");
        System.out.println(c.name + " " + c.branch + " " + c.college);
    }
}
