package AbstractClasses;
/**
 * AbstractClasses
 */

 // Abstract class
abstract class Animal{
    // Abstract method
    abstract void introduce();   
}

class Cat extends Animal{
    void introduce(){
        System.out.println("Heyy , I am a Cat");
    }
}

class Elephant extends Animal{
    void introduce(){
        System.out.println("Heyy , I am an Elephant");
    }
}

class AbstractClasses1 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.introduce();
        Elephant e1 = new Elephant();
        e1.introduce();
    }
}


/* 
 * Abstraction : It is used to hiding the details and showing some details from the user.
 * keyword 'abstract' is used for both abstract classes and abstract methods.
 * Abstract method : It is a method which doesn't have body. Implementations are different for different child classes.
 *       so, we made them abstract in parent and implemented in child classes
 * Concrete method : It is like a normal method which has body. Implementations for all the child classes are same.
 *       so, we implemented them in parent class as concrete method.
 * Abstract claass : If the class contains atleast one abstract method , then we have to make the class as abstract.
 * we can't create instances(objects) for the abstract classes.
 * The major use of abstract clases used in inheritance .
 * A class which is inherited from the abstract class should contain the implementation for all abstract methods.
 * If the child class fails to provide implementation for all the abstract methods in parent class , 
 *   the child class should also be made as abstract.
 */