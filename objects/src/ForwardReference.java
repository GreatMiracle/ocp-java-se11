class Thing {

    // Constructor
    Thing() {
//        secondString = "b" + secondString;
        secondString = "b" + firstString + fiveString;
    }

    // Initializer
    {
//        firstString = this.secondString;
        firstString = "d" + thirdString;
        fiveString= "6";
    }

    // Static Initializer
    static {
//        System.out.println(thirdString);
        thirdString = "c" ;
    }

    static {
        fiveString= "5";
    }

    // Two instance variables
    String firstString= "kien";
    String secondString;
    String fourString ;

    // static variable
    static String thirdString= "999";
    static  String fiveString ;

    public String toString() {
        return firstString + secondString + thirdString;
    }
}

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one);
    }
}