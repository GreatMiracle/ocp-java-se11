package OutOfTheOrdinary;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class IOFilesCopyMove {

    // Use File walker to print information about Directory
    private static void printDir(Path p) throws IOException {
        System.out.println(p + " is directory? " +
                Files.isDirectory(p));
        if (Files.isDirectory(p)) {
            try (Stream<Path> str = Files.walk(p)) {
                str.forEach((s) -> System.out.println("\t\t" + s));
            }
        }
    }

    // Executes Files.copy(Path source, Path target, CopyOption... options)
    private static void copyMethod(Path source, Path target)
            throws IOException {

        // Path is returned from this Files.copy method
        Path result = null;
        try {
            // Make first attempt without options
            System.out.println("First attempt, no options");
            result = Files.copy(source, target);

        } catch (IOException io) {

            System.out.println("\tFirst attempt failed: " + io);
            System.out.println("\tSecond attempt, Use REPLACE_EXISTING");
            try {
                // Make Second attempt with REPLACE_EXISTING options
                result = Files.copy(source, target,
                        StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ioNested) {
                System.out.println("\t\tSecond attempt failed: " + ioNested);
            }
        }
        if (result != null) {
            // Print information about result
            System.out.println("\tCopy was successful: " + result +
                    " : " + (Files.isDirectory(result) ? " Directory" : "File"));
            if (Files.isDirectory(result)) printDir(result);

        }
    }

    // Tests copying file to file
    private static void testFileToFile() throws IOException {
        Path fileSource = Path.of("C:\\Users\\admin\\Documents\\improve-ocp\\ocp-java-se11\\IOFile\\src\\OutOfTheOrdinary\\copiedFrom.txt");
        Path fileTarget = Path.of("C:\\Users\\admin\\Documents\\improve-ocp\\ocp-java-se11\\IOFile\\src\\OutOfTheOrdinary\\copiedTo.txt");

        // Delete source file if it exists.
        Files.deleteIfExists(fileSource);
        Files.deleteIfExists(fileTarget);

        // Create source file, add a String
        Files.writeString(fileSource, "Hello");

        // First Test - copy existing source file to a
        // non-existing target file
        System.out.println("--------------------------------------");
        System.out.println("Existing File to Non-Existing File");
        System.out.println("--------------------------------------");
        copyMethod(fileSource, fileTarget);

        // Second Test - copy existing source file to an
        // existing target file
        System.out.println("--------------------------------------");
        System.out.println("Existing File to Existing File");
        System.out.println("--------------------------------------");
        copyMethod(fileSource, fileTarget);
    }

    public static void main(String[] args) throws IOException {
//        testFileToFile();
        testFileToDir();
    }

    // Uses Files.walk recursively to delete all elements in a directory.
    private static void deleteDir(Path p) throws IOException {

        if (Files.isDirectory(p)) {
            // Walk using only a depth of 1
            try (Stream<Path> str = Files.walk(p, 1)) {
                str
                        // remember that walk returns a reference to current path
                        // filter it out
                        .filter((s) -> !s.equals(p))
                        // Recursively execute this method.
                        .forEach((s) ->
                        {
                            try {
                                IOFilesCopyMove.deleteDir(s);
                            } catch (IOException io) {

                            }
                        });
            }
        }
        // Finally delete current element
        Files.deleteIfExists(p);
    }

    // Tests copying a File to a existing Directory
    private static void testFileToDir() throws IOException {
        Path fileSource = Path.of("C:\\Users\\admin\\Documents\\improve-ocp\\ocp-java-se11\\IOFile\\src\\OutOfTheOrdinary\\copiedFrom.txt");
        Path directoryTarget = Path.of("C:\\Users\\admin\\Documents\\improve-ocp\\ocp-java-se11\\IOFile\\src\\OutOfTheOrdinary\\copiedToDir");

        // Delete source file if it exists.
        Files.deleteIfExists(fileSource);
        // Create source file, add a String
        Files.writeString(fileSource, "Hello");

        // Delete target directory if it exists.
        deleteDir(directoryTarget);
        // Recreate target directory
        Files.createDirectory(directoryTarget);

        System.out.println("--------------------------------------");
        System.out.println("Existing File to Existing Empty Directory");
        System.out.println("--------------------------------------");
        // First Test - copy existing source file to a
        // existing directory
        printDir(directoryTarget);
        copyMethod(fileSource, directoryTarget);

        System.out.println("--------------------------------------");
        System.out.println("Existing File to Existing Non-Empty Directory");
        System.out.println("--------------------------------------");
        // Second Test - copy existing source file to a directory that
        // is not empty
        Files.deleteIfExists(directoryTarget);
        directoryTarget = Path.of("copiedToDir/subDirectory");
        // Create a directory with a sub directory
        Files.createDirectories(directoryTarget);
        // Use the printDir method to print contents of copied directory
        printDir(directoryTarget.getParent());
        copyMethod(fileSource, directoryTarget.getParent());

    }
}