/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Objects;
import java.util.Scanner;
public class Order {
    double orderAmount;
    double tax=0.00;
    String state;
    public void read() {
        //scans in values orderAmount and the state
        //if state is WI go to calculate tax
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        orderAmount = sc.nextDouble();
        System.out.print("What is the state? ");
        state = sc.next();
        if(Objects.equals(state, "WI")) {
            calculateTax();
        }
    }
    public void calculateTax() {
        //tax=amount*0.055
        //goes to printWI
        tax = orderAmount*(0.055);
        printWI();
    }
    public void print() {
        //if not WI print just the total orderAmount
        System.out.print("The total is $"+orderAmount+".");
    }
    public void printWI() {
        //if state is WI printf out subtotal (orderAmount), tax (tax), and total (orderAmount+tax)
        System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", orderAmount, tax, (orderAmount+tax));
        System.exit(0);
    }
}
