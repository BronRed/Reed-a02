/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many euros are you exchanging? ");
        double amountEuros = sc.nextDouble();
        System.out.println("What is the exchange rate? ");
        double exchangeRate = sc.nextDouble();

        double amountUSD = exchangeRate*amountEuros;

        System.out.printf("%.2f euros at an exchange rate of %f is %.2f U.S. dollars.", amountEuros, exchangeRate, amountUSD);
    }
    public static double roundUp(){
        
    }
}
