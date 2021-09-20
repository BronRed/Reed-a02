/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.*;
public class RetirementCalculator {
    public static void calculator(int age, int retirementAge) {
        //use Calendar to get current year
        //years left until retirement = retirement age - age
        //retirement year = year + years left
        //print out years left until retirement and retirement year
        //if retirement year already past, print "You can already retire"
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearsLeft = retirementAge - age;
        if (yearsLeft >= 0) {
            int retirementYear = year + yearsLeft;
            System.out.println("You have " + yearsLeft + " years left until you can retire.");
            System.out.println("It's " + year + ", so you can retire in " + retirementYear + ".");
        }
        else {
            System.out.println("You can already retire");
        }
    }
}
