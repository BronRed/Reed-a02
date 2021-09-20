/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class CurrencyExchange {
    double euros;
    double rate;
    public void read() {
        //prompts user for euros
        //prompts user for current exchange rate
        Scanner sc = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        euros = sc.nextDouble();
        System.out.print("What is the exchange rate? ");
        rate = sc.nextDouble();
    }
    public void print() {
        //calculates usd using usd = euros*rate
        double usd = euros *rate;
        System.out.printf("%.2f euros at an exchange rate of %.5f is\n%.2f U.S. dollars.", euros, rate, usd);
    }
}
