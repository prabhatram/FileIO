package ReadFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadFile {
    public static void main(String[] args) throws Exception {
        

        //Path inputPath = Paths.get("/Users/pram/Downloads/Test.txt");
        Path inputPath = Paths.get("/Users/pram/Downloads/Test2.txt");

        InputStream input = null;


        try{
            input = Files.newInputStream(inputPath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String str = null;
            //str = reader.readLine();

            while((str = reader.readLine()) != null){
                System.out.println(str);    
            }

            //System.out.println(str);
            input.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}