package SequentialWrite;


import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import static java.nio.file.StandardOpenOption.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;

public class SequentialWrite {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        Path inputPath = Paths.get("/Users/pram/Downloads/Students.txt");

        String s = "";
        String delimiter = ",";

        int id;
        String name;
        int age;
        String grades;
        final int QUIT = 999;

        try{
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(inputPath, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.println("Enter student id:");
            id = scan.nextInt();
            

            while(id != QUIT){
                System.out.println("Enter student name:");
                scan.nextLine();
                name = scan.nextLine();

                System.out.println("Enter student age:");
                age = scan.nextInt();
                scan.nextLine();

                System.out.println("Enter student grades:");
                grades = scan.nextLine();

                s = id + delimiter + name + delimiter + age + grades;

                writer.write(s, 0, s.length());
                writer.newLine();

                System.out.println("Enter next student ID or " + QUIT + " to quit:");
                id=scan.nextInt();

            }
            writer.close();
        }


        catch(IOException e){
            System.out.println(e);
        }
        scan.close();
    }
}