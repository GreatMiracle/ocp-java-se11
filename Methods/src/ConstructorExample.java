
// Create a class - no constructor defined
class ATest {
    ATest(String name, int b) {
        System.out.println("I am super " + name);
    }
    ATest(){

    }
}

// Create a sub class
class BTest extends ATest {
    private String name;

    // Constructor has one parameter
    BTest(String name) {
//        super(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

public class ConstructorExample {
    public static void main(String[] args) {

        // Instantiate the object with the one parameter constructor
        BTest btest = new BTest("Jeff");
        System.out.println(btest.getName());
    }
}


//class SuperTest {
//    SuperTest(int k){
//
//    }
//
//    SuperTest(){
//
//    }
//
//}
//
//public class ConstructorExample extends SuperTest {
//    int first, second, third;
//
//    public ConstructorExample(int x, int y) {
//        first = x;
//        second = y;
//    }
//
//    public ConstructorExample(int x) {
//        super(x);
//    }
//}


