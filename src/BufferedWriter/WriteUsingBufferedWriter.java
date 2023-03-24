package BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class WriteUsingBufferedWriter {
    public static void main(String[] args) throws Exception {

        //Path inputPath = Paths.get("/Users/pram/Downloads/Students.txt");

        String [] names = {"Homer Simpson", "Marge Simpson", "Bart Simpson", "Lisa Simpson", "Maggie Simpson"};
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/pram/Downloads/BWriter.txt"));
            writer.write("I wrote something to this file.");
            writer.write("\nI wrote something else to this file.");
            
            for(String name: names){
                writer.write("\n" + name);
            }
            
            writer.close();
        }    
        catch(IOException e){
            System.out.println(e);
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("/Users/pram/Downloads/BWriter.txt"));
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            } 
            reader.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
}