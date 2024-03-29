package org.pkg.appglobals;

// Set up a public class with some global static fields
public class ApplicationConstants {

    // APP_NAME is a constant
    public static final String APP_NAME = "Module Test";

    // counter will be a global counter
    private static int counter;

    // increment counter
    public static void addCounter() {
        counter += 1;
    }

    // retrieve value of the counter
    public static int getCounter() {
        return counter;
    }
}