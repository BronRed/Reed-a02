/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int s2PerGallon = 350;

        //Prompt user for ceiling length and width and store values
        //area = length x width
        //1 gallon paints 350 ft2
        //area/350 = amount of paint needed
        //cannot have fraction of paint so round up Math.ceil()
        System.out.println("What is the length of the ceiling? ");
        double length = sc.nextInt();
        System.out.println("What is the width of the ceiling? ");
        double width = sc.nextInt();

        double area = length*width;
        double calculation = area/s2PerGallon;
        double numGallons = Math.ceil(calculation);

        //System.out.println("You will need to purchase "+Math.ceil(calculation)+" gallons of paint to cover "+area+" square feet.");
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", numGallons, area);
        }
    }

