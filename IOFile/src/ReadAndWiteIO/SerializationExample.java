package ReadAndWiteIO;


import java.io.*;
//
//class Animal  {
//    int age;
//    int weight;
//
//    Animal() {
//        System.out.println("Inside a no-args Animal constructor");
//    }
//
//    Animal(int age) {
//        System.out.println("Inside single args Animal constructor");
//    }
//}
//
//// Class must implement Serializable if it does not extend
//// a class that implements Serializable...
//class Pet extends Animal implements Serializable {
//    private String name;
//    private String type;
//    private transient String breed = "Unknown";
//
//    // No arguments constructor
//    Pet() {
//        super(0);
//        System.out.println("Inside no args Pet constructor");
//    }
//
//    // Constructor takes name and type of Pet
//    Pet(String name, String type) {
//        super(0);
//        this.name = name;
//        this.type = type;
//        System.out.println("Inside Pet(name,type) constructor");
//    }
//
//    // Use IntelliJ generated toString() method
//    public String toString() {
//        return "Pet{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", breed='" + breed + '\'' +
//                ", age='" + age + '\'' +
//                ", weight='" + weight + '\'' +
//                '}';
//    }
//
//}
//
//public class SerializationExample {
//    public static void main(String[] args) throws IOException,
//            ClassNotFoundException {
//
//        String fileName = "IOFile/src/ReadAndWiteIO/Brandy.ser";
//
//        Pet originalPet = new Pet("Brandy", "Dog");
//        originalPet.age = 5;
//        originalPet.weight = 30;
//
//        System.out.println("--------- Original State -----------");
//        System.out.println(originalPet);
//
//        // Use try with resources (automatically closes file) to output
//        // the Pet object
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream(fileName))) {
//            // write the Pet to a file
//            outputStream.writeObject(originalPet);
//        }
//
//        Pet deserializedPet = null;
//        // Use try with resources (automatically closes file) to input
//        // the Pet object
//        try (ObjectInputStream inStream = new ObjectInputStream(
//                new FileInputStream(fileName))) {
//            try {
//                // read the Pet from a file
//                deserializedPet = (Pet) inStream.readObject();
//
//                // Need to check for EOFException
//            } catch (EOFException e) {
//                // Ignore, end of file
//            }
//        }
//
//        System.out.println("------- Deserialized State ------");
//        System.out.println(deserializedPet);
//
//    }
//}



import java.io.*;

// Class must implement Serializable if it does not extend
// a class that implements Serializable...
class Pet implements Serializable {
    private String name;
    private String type;
    private transient String breed = "Unknown";

    // No arguments constructor
    Pet() {
        System.out.println("Inside no args Pet constructor");
    }

    // Constructor takes name and type of Pet
    Pet(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("Inside Pet(name,type) constructor");
    }

    // Use IntelliJ generated toString() method
//    public String toString() {
//        return "Pet{" +
//                "name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                '}';
//    }

    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

}

public class SerializationExample {
    public static void main(String[] args) throws IOException,
            ClassNotFoundException {

        String fileName = "IOFile/src/ReadAndWiteIO/Brandy.ser";

        Pet originalPet = new Pet("Brandy", "Dog");
        System.out.println("--------- Original State -----------");
        System.out.println(originalPet);

        // Use try with resources (automatically closes file) to output
        // the Pet object
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream(fileName))) {
//            // write the Pet to a file
//            outputStream.writeObject(originalPet);
//        }

        Pet deserializedPet = null;
        // Use try with resources (automatically closes file) to input
        // the Pet object
        try (ObjectInputStream inStream = new ObjectInputStream(
                new FileInputStream(fileName))) {
            try {
                // read the Pet from a file
                deserializedPet = (Pet) inStream.readObject();

                // Need to check for EOFException
            } catch (EOFException e) {
                // Ignore, end of file
            }
        }

        System.out.println("------- Deserialized State ------");
        System.out.println(deserializedPet);

    }
}
