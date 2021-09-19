/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution18 {
    public static void main(String[] args) {
        //ask user for input C or F
        //if C, scan for temperature in F
        //if F, scan for temp in C
        //pass to respective calculation function
        //pass to print function with calculated value and "Fahrenheit" or "Celsius"
        String input;
        Solution18 conversion = new Solution18();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        input = sc.next();
        if(input.equalsIgnoreCase("C")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            conversion.print("Celsius", conversion.calculateC());
        }
        else if(input.equalsIgnoreCase("F")) {
            System.out.print("Please enter the temperature in Celsius: ");
            conversion.print("Fahrenheit", conversion.calculateF());
        }
    }
    public int calculateC() {
        //get value in fahrenheit
        //use (F-32)*5/9 to get C
        //return C
        Scanner sc = new Scanner(System.in);
        int fahrenheit = sc.nextInt();
        return (fahrenheit - 32)*5/9;
    }
    public int calculateF() {
        //get value in celsius
        //use (c*9/5)+32 to get F
        //return F
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        return (celsius*9/5)+32;
    }
    public void print(String type, int value) {
        //The temperature in Fahrenheit is X
        //OR
        //The temperature in Celsius is Y
        System.out.println("The temperature in "+type+" is "+value+".");
    }
}
