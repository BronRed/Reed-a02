/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution06 {
    public static void main(String[] args) {
        //prompts user for current age
        //prompts user for retirement age
        //pass to retirementcalc class to calculate retirement age and year
        int age;
        int retirementAge;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your current age? ");
        age = sc.nextInt();
        System.out.print("At what age would you like to retire? ");
        retirementAge = sc.nextInt();
        RetirementCalculator.calculator(age,retirementAge);
    }
}
