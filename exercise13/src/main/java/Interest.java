/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
class Interest {
    double principal;
    double rateOfInterest;
    int numYears;
    int compoundPerYear;
    public void read() {
        //prompts user for relevant data (principal, roi, years, numCompoundPerYear)
        //Stores data
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        this.principal = sc.nextDouble();
        System.out.print("What is the rate? ");
        this.rateOfInterest = sc.nextDouble();
        System.out.print("What is the number of years? ");
        this.numYears = sc.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        this.compoundPerYear = sc.nextInt();
    }
    public void print() {
        //calculates A using A = P(1 + r/n)^(n*t)
        //print relevant data ($A invested at B% for C years compounded D times per year is $F.)
        double amount3 = principal*Math.pow(1+((rateOfInterest*0.01)/compoundPerYear),compoundPerYear*numYears);
        System.out.printf("$%.2f invested at ", principal);
        System.out.print(rateOfInterest+"% for "+numYears+" years compounded "+compoundPerYear+" per year is ");
        System.out.printf("$%.2f.", amount3);
    }
}
