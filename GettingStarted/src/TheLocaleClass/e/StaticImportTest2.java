package TheLocaleClass.e;

public class StaticImportTest2 {
    public static  String APP_NAME = "Second";

    public static void log(String statement) {
        System.out.println("Second Logging statement: " + statement);
    }

    public void printUniqueStatement() {
        System.out.println("I am Second");
    }
}
