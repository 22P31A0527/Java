package AbstractClasses;
abstract class Bank {
    abstract void printInterestRate();
    abstract void printIFSC();
    abstract void printBranchName();
}
abstract class CanaraBank extends Bank {
    void printInterestRate() {
        System.out.println(7.6);
    }
}
class CanaraBankSurampalem extends CanaraBank {
    void printInterestRate() {
        System.out.println(7.6);
    }
    void printIFSC(){
        System.out.println("CANB837532");
    }
    void printBranchName() {
        System.out.println("Surampalem");
    }
}
public class AbstractClasses3 {
    public static void main(String[] args) {
        
    }
}
