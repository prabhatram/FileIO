package WriteFile;


import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws Exception {
        

        Path inputPath = Paths.get("/Users/pram/Downloads/Test.txt");

        String str = "RANDOM";
        byte [] data = str.getBytes();

        OutputStream output = null;


        try{
            output = new BufferedOutputStream(Files.newOutputStream(inputPath, CREATE));
            output.write(data);
            output.flush();
            output.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}