/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
class Interest {
    double principal;
    double rateOfInterest;
    int numYears;
    public void read() {
        //prompts user for relevant data (principal, roi, years)
        //Stores data
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        this.principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        this.rateOfInterest = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        this.numYears = sc.nextInt();
    }
    public void print() {
        //calculates A using A = P(1 + rt) and rounds to the nearest $0.01
        //print relevant data ("After x years at y% the investment will be worth $z")
        //double amount3 = principal*Math.pow(1+((rateOfInterest*0.01)/compoundPerYear),compoundPerYear*numYears);
        //int amount =(int) Math.round(principal * (1 + rateOfInterest * numYears * 0.01));
        double amount = principal*(1+(rateOfInterest*numYears*0.01));
        System.out.print("After " + numYears + " years at " + rateOfInterest + "%, the investment will be worth ");
        System.out.printf("$%.2f.", amount);
    }
}
