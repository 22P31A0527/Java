class Cat{
    String name ;
    int age;
    Cat(String s , int a){
        name = s;
        age = a;
    }
    public String toString() {
        return "I_am_" + name;
    }

}
public class ReturnAddress {
    public static void main(String[] args) {
        Cat c = new Cat("meow" , 2);
        System.out.println(c);
    }
}
