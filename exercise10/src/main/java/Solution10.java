/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution10 {
    public static void main(String[] args) {
        //Obtain values for price and qty of each item as string.
        //Pass to stringToDouble function
        //subtotal = (priceitem1*qtyitem1)+(priceitemx*qtyitemx)+...
        //tax = (subtotal*5.5)/100
        //total = subtotal+tax
        System.out.print("Enter the price of item 1: ");
        double priceItem1 = stringToDouble();
        System.out.print("Enter the quantity of item 1: ");
        double qtyItem1 = stringToDouble();

        System.out.print("Enter the price of item 2: ");
        double priceItem2 = stringToDouble();
        System.out.print("Enter the quantity of item 2: ");
        double qtyItem2 = stringToDouble();

        System.out.print("Enter the price of item 3: ");
        double priceItem3 = stringToDouble();
        System.out.print("Enter the quantity of item 3: ");
        double qtyItem3 = stringToDouble();

        double subTotal = (priceItem1*qtyItem1)+(priceItem2*qtyItem2)+(priceItem3*qtyItem3);
        double tax = (subTotal*5.5)/100;
        double total = subTotal+tax;

        System.out.printf("Subtotal: $%.2f%n", subTotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);

    }
    public static double stringToDouble() {
        //scan string
        //convert string to double
        Scanner scan = new Scanner(System.in);
        String temp = scan.next();
        return Double.parseDouble(temp);
    }
}
