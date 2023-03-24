package Paths;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.AccessMode.*;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a file name:");
        String name = input.nextLine();

        Path inputPath = Paths.get(name);
        //Path inputPath = Paths.get("/Users/pram/Downloads/Test.pdf");

        System.out.println("inputPath value for the filename entered is:" + inputPath);
        
        Path absPath = inputPath.toAbsolutePath();
        
        System.out.println("absPath value for the filename entered is:" + absPath.toString());

       /*  FileSystem fs = FileSystems.getDefault();
        System.out.println("The current file system is " + fs.toString());

        
        Path filepath = Paths.get("/Users/pram/Documents/Lecture 15 - File IO (practice before demo)/FileIO/src/App.class");


        */
        //System.out.println("The filepath is  " + filepath.toString());
        
        
        //absPath.getFileSystem().provider().checkAccess(absPath, READ, EXECUTE);
        //System.out.println("The file exists and can be read and executed");
        
        
        input.close();
    }
}
