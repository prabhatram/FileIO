package ParsingData;


import java.io.BufferedInputStream;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import java.util.Scanner;

public class ParsingData {
    public static void main(String[] args) throws Exception {
        
        //Scanner scan = new Scanner(System.in);

        Path inputPath = Paths.get("/Users/pram/Downloads/Groceries.txt");

        String [] array = new String[4];
        String s = "";
        String delimiter = ",";

        int id;
        String item;
        String qty;
        double price;
        double total = 0;

        try{
            InputStream input = new BufferedInputStream(Files.newInputStream(inputPath));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();

            while(s != null){
                array = s.split(delimiter);
                id = Integer.parseInt(array[0]);
                item = array[1];
                qty = array[2];
                price = Double.parseDouble(array[3]);

                total += price;
                
                System.out.println("ID#" + id + "\t" + item + "\t" + "\t" + qty + "\t" + price + ".");
                s = reader.readLine();
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println("The grocery shopping total is: €" + total);
    }
}