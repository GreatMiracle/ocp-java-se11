
// Abstract Class
abstract class ConceptualClass {

    // protected no args Constructor
//    private ConceptualClass() {
//
//    }

    protected ConceptualClass(String s1) {
        printSomething(s1);
    }

    public ConceptualClass() {

    }

    // abstract method
    public abstract void printSomething(String s1);
}

// Concrete Class
class RealClass extends ConceptualClass {

    // No args constructor
    public RealClass(String s1) {
        super(s1);
    }

    public RealClass() {
        super();

    }


    // implements abstract method
    public void printSomething(String s1) {
        System.out.println(s1);
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {

        // Create an instance of Concrete class with no args constructor
        RealClass c = new RealClass("Hello World");

        // Execute method on object with the standard text.
        c.printSomething("Hello World");

    }
}