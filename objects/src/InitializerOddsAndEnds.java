class ASuperClass {
    String name;

    // Constructor for Super Class
    ASuperClass() {
        System.out.println("Parent constructor executes " +fiveString);

        System.out.println("Parent firstString " +firstString);
    }





    ASuperClass(String name) {
        this.name = name;
        System.out.println("Parent constructor executes");
    }


    {
        firstString= "6";
    }


    static {
        fiveString= "5";
    }
    static  String fiveString ;
    String firstString= "kien";



    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "My name is " + this.name;
    }
}

class ASubClass extends ASuperClass {

    // Constructor for Sub Class
//    ASubClass() {
//        System.out.println("Child no args constructor executes");
//        setName(name);
//    }

    // Constructor for Sub Class
    ASubClass(String name) {
//        super();
//        super(name);
        System.out.println("Child single argument constructor executes" + fiveStringChild);
        setName(name);
    }


//    public ASubClass(String name) {
//        super(name);
//    }

    // Initializer code
    {
        this.name = "Override";
        System.out.println("Child initializer executes");
        System.out.println(this);
    }


    static {
        fiveStringChild= "chil5 ";
    }
    static  String fiveStringChild ;

}

public class InitializerOddsAndEnds {
    public static void main(String[] args) {
        ASubClass joe = new ASubClass("Joe");
        System.out.println(joe);
    }
}