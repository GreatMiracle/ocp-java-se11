import java.io.IOException;

class BaseClass {
    public void goodMethod() throws IOException {
        System.out.println("BaseClass executing good method");
    }

    public void printInformation(CharSequence s) {
        System.out.println("BaseClass prints " + s);
    }

    public CharSequence getInformation() {
        return getClass().getName();
    }
}

class ExtendedClass extends BaseClass {

    public void goodMethod() throws IOException {
        super.goodMethod();
        System.out.println("AND ExtendedClass executing a better method");
    }

    public void printInformation(CharSequence string) {
        System.out.println("ExtendedClass prints " + string);
    }

    public String getInformation() {
        return getClass().getName();
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        ExtendedClass e = new ExtendedClass();
        try {
            e.goodMethod();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        e.printInformation(e.getInformation());
        e.printInformation((CharSequence) e.getInformation());
    }
}