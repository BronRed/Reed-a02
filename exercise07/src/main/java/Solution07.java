/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;

public class Solution07 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            //Prompt user for room length and store value
            //Prompt user for room width and store value
            //Display dimensions of room
            //Calculate are of room lxw
            //Use conversion f2 to m2 (area*0.09290304)
            //Display area in f2 and m2
            System.out.println("What is the length of the room in feet?");
            double length = scan.nextDouble();
            System.out.println("What is the width of the room in feet?");
            double width = scan.nextDouble();
            System.out.println("You entered dimension of " + length + " by " + width + " feet");


            double area = length * width;
            final double conversionFactor = area * 0.09290304;


            System.out.println("The area is");
            System.out.printf("%.0f square feet%n", area);
            System.out.printf("%.3f square meters", conversionFactor);
        }
}
