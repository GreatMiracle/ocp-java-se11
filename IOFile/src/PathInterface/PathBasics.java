package PathInterface;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathBasics {
    // main method simply calls a method that shows multiple ways to
    // create Path instances
    public static void main(String[] args) {
        pathCreations();
        showData("");
        showData("characterData.txt");
    }

    // Method demonstrates many ways to create Path instances
    public static void pathCreations() {
//--- Using Path as a reference to a directory

        // Path object to current working directory
//        Path cwd = Paths.get("");
//        System.out.println(cwd.toAbsolutePath());

//        C:\Users\admin\Documents\improve-ocp\ocp-java-se11
        // Specifying a full path using windows forward slashes
        Path currentdir = Paths.get("\\Users\\admin\\Documents\\improve-ocp\\ocp-java-se11\\IOProject\\abc");
        System.out.println(currentdir.toAbsolutePath());


        // Using Path.of to get a path using Strings
        Path cdir2 = Path.of("C:", "Users", "admin",
                "improve-ocp", "ocp-java-se11");
        System.out.println(cdir2.toAbsolutePath());

        Path filePath1 = Paths.get(URI.create(
                "file:///C:/Users/admin/Documents/improve-ocp/ocp-java-se11/IOFile/src/ReadAndWiteIO/characterData.txt"));
        System.out.println("filePath1:::: " + filePath1.toAbsolutePath());

        // FileSystems.getDefault() gives default file system object
        // which has a method getPath
        Path filePath2 = FileSystems.getDefault().getPath("C:",
                new String[]{
                        "Users",
                        "admin",
                        "Documents",
                        "improve-ocp",
                        "ocp-java-se11",
                        "IOFile",
                        "src",
                        "ReadAndWiteIO",
                        "characterData.txt"});
        System.out.println("filePath2:::: " +filePath2.toAbsolutePath());

    }

    public static void showData(String pathName) {
        System.out.println("---- Path data for '" + pathName + "' ----");

        Path path = Paths.get(pathName).toAbsolutePath();

        System.out.println("Absolute Path: " + path.toString() +
                "   [toString()]");

        // Get filename, in this case, current directory
        System.out.println("File/Dir of Path object: " +
                path.getFileName() + "   [getFileName()]");

        // Parent directory returned as a Path
        System.out.println("Parent Directory: " + path.getParent()
                + "   [getParent()]");

        // Get part of the path, using names
        System.out.println("Getting subpath: " + path.subpath(0, 2)
                + "   [subpath(0,2)]");

        // Number of sub directories in the path
        System.out.println("Number of Sub-Directories: " +
                path.getNameCount() + "   [getNameCount()]");

        // Use methods to 'draw' the directory structure
        System.out.println("Directory Structure using path.getName()");


        System.out.format("%s   [getRoot()]: %n", path.getRoot());
        for (int i = 0; i < path.getNameCount(); i++) {
            for (int j = 0; j <= i; j++) System.out.print("\t");

            // Note that getName returns a Path object
            System.out.println("---> " + path.getName(i) +
                    "   [getName(" + i + ")]");
        }

        System.out.println("Directory Structure using path iterator");
        // Alternately use the names iterator..
        int i = 0;
        for (Path name : path) {
            for (int j = 0; j <= i; j++) System.out.print("\t");
            System.out.println("---> " + name);
            i++;
        }
        System.out.println("------------------------------");


    }
}
