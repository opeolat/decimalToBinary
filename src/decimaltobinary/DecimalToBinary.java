/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltobinary;

import java.util.Scanner;

/**
 *
 * @author Opeyemi
 */
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // set us the console to receive input
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter the number to convert
        System.out.println("Please enter the Decimal number to convert: ");
        
        //assign the number entered to a variable called numberToConvert
        int numberToConvert = input.nextInt();
        
        
        // using the method convertNumber to convert the number here
        //and printing out the result in a formatted order
        if (numberToConvert > 0) {
            System.out.println("The Binary Conversion is for "
                    + numberToConvert + " is: "
                    + convertNumber(numberToConvert));

        }
        System.out.println();
        System.out.println("-----------Program Ends--------------");

    }
    
    
    //creating a method to convert decimal to binary using string builder
    public static String convertNumber(int number) {
        
        //using java library stringbuilder where results will be stored
        StringBuilder convert = new StringBuilder();
        
        //this iterate to condition the loop
        int index = 0;

        while (number > 0) {
            convert.append(number % 2);//adding the result to string convert
            index++;
            number = number / 2;
        }

        //System.out.println(convert.reverse());//testing raw output
        
        //reversiing the string output and printing and parsing it as string
        return convert.reverse().toString();
    }

}
