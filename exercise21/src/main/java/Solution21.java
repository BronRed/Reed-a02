/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution21 {
    public static void main(String[] args){
        //prompt for month number
        //pass to switchCase to get month name
        Scanner sc = new Scanner(System.in);
        Solution21 a = new Solution21();
        System.out.print("Please enter the number of the month: ");
        int number = sc.nextInt();
        a.switchCase(number);
    }
    public void switchCase(int number){
        //switch case# is respective month name
        //eg: month#1 is January, month#7 is July
        //print month name based on user input
        String month = null;
        switch (number) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
            default -> System.out.println("Please enter a valid month number.");
        }
        System.out.print("The name of the month is "+month+".");
    }
}
