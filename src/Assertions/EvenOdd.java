package Assertions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = input.nextInt();
        input.nextLine();
        
        boolean result;
        if(number%2 == 1){
            result = false;

        }
        else{
            result = true;
            assert number%2 == 0 : number + " % 2 is" + number %2;
        }
    
        input.close();
        System.out.println(result);
    }
    
}
