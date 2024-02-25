// creating a class person
class Person {
    // creating members variables which are non-staic / instance members
    String name;   //default value of the string is null
    int age;        //default value of int is 0

    //non-static / instance member functions
    void printDetails(){
        System.out.println("my name is "+name+" and i am "+age+" years old");
    }
}
public class OOPSExample1 {
    public static void main(String[] args) {
        //creating references of the class person
        Person p1 = new Person();

        // if we don't assign the values to the memner variables , it takes default value
        System.out.println(p1.name);  
        System.out.println(p1.age);

        // assigning the values
        p1.name = "Anju";
        p1.age = 19;
        p1.printDetails();
    }
}
