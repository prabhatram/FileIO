package SequentialRead;


import java.io.BufferedInputStream;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;




import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import java.util.Scanner;

public class SequentialRead {
    public static void main(String[] args) throws Exception {
        
        //Scanner scan = new Scanner(System.in);

        Path inputPath = Paths.get("/Users/pram/Downloads/Students.txt");

        String s = "";

        try{
            InputStream input = new BufferedInputStream(Files.newInputStream(inputPath));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();

            while(s != null){
                System.out.println(s);
                s = reader.readLine();
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        //scan.close();
    }
}