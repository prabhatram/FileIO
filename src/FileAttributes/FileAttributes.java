package FileAttributes;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class FileAttributes {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter a file name:");
        //String name = input.nextLine();

        Path inputPath = Paths.get("/Users/pram/Downloads/Test.pdf");

        System.out.println("inputPath value for the filename entered is:" + inputPath);
        
        Path absPath = inputPath.toAbsolutePath();
        String finalPath = absPath.toString();
        
        System.out.println("absPath value for the filename entered is:" + finalPath);

        try{
            BasicFileAttributes attr = Files.readAttributes(absPath, BasicFileAttributes.class);
            System.out.println("Creation time:" + attr.creationTime());
            System.out.println("Last modified time:" + attr.lastModifiedTime());
            System.out.println("File size:" + attr.size());
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        
        input.close();
    }
}