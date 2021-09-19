/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution20 {
    double tax=0.0;
    double orderAmount;
    double total;
    String state;
    String county;
    public static void main(String[] args){
        //call read to get info
        //call calculate to get tax amount
        //call print to output total and tax amount
        Solution20 a = new Solution20();
        a.read();
        a.calculateTax();
        a.print();
    }
    public void read(){
        //prompt for orderAmount
        //prompt for state
        //if state is wisconsin, ask for county
        //if state is NOT wisconsin, county is irrelevant
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        orderAmount = sc.nextDouble();
        System.out.print("What state do you live in? ");
        state = sc.next();
        if(state.equalsIgnoreCase("Wisconsin")){
            System.out.print("What county do you live in? ");
            county = sc.next();
        }
        else{
            county = "irrelevant";
        }
    }
    public void calculateTax(){
        //if state is illinois, tax is 8%
        //if state is wisconsin, tax is 5% + county tax
        //if state is neither, no tax
        //if wisconsin county is eau claire, tax = 5%+0.5%
        //if wisconsin county is dunn, tax = 5%+0.4%
        //total=orderAmount*(1+tax)
        if(state.equalsIgnoreCase("Illinois")){
            tax+=0.08;
        }
        else if(state.equalsIgnoreCase("Wisconsin")){
            tax+=0.05;
        }
        if(county.equalsIgnoreCase("Eau Claire")){
            tax+=0.005;
        }
        else if(county.equalsIgnoreCase("Dunn")){
            tax+=0.004;
        }
        total = (orderAmount*(1+tax));
    }
    public void print(){
        //print tax amount
        //print total amount
        System.out.printf("The tax is $%.2f.\n", (orderAmount*tax));
        System.out.printf("The total is $%.2f.", total);
    }
}
