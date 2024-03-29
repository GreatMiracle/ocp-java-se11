//class Parent {
//    static {
//        System.out.println("Static Block in Parent");
//    }
//
//    {
//        System.out.println("Instance Block in Parent");
//    }
//
//    Parent() {
//        System.out.println("Constructor in Parent" + abc);
//    }
//    int abc =10;
//}
//
//class Child extends Parent {
//    static {
//        System.out.println("Static Block in Child");
//    }
//
//    {
//        System.out.println("Instance Block in Child");
//    }
//
//    Child() {
////        super();
//        System.out.println("Constructor in Child");
//    }
//}
//
//public class Example {
//    public static void main(String[] args) {
//        Child child = new Child();
//    }
//}



/**
 * Initial Order
 *
 *
 * */
class Person {
    public Person(){
        System.out.println("[Parent]:Person constructor");
    }

    {
        System.out.println("[Parent]:Person instance initializer block");
        id = 10;
    }
    static {
        System.out.println("[Parent]:Person static initializer block");
    }
    int id;
}

class Student extends Person {

    public Student() {
        System.out.println("[Children]:Student constructor");
    }

    {
        System.out.println("[Children]:Student instance initializer block 1");
        name = "Name";
        country = "Country";
    }

    static {
        System.out.println("[Children]:Student static initializer block");
        country = "US";
    }

    {
        System.out.println("[Children]:Student instance initializer block 2");
        age = 100;
    }

    static String country = "VN" ;
    String name = "Quan";
    int age = 24;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SelfTestInitialOrder {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
    }
}