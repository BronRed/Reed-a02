/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution22 {
    int num1;
    int num2;
    int num3;
    public static void main(String[] args) {
        //prompt user for num1, num2, num3
        //pass to compare() to find largest num
        Scanner sc = new Scanner(System.in);
        Solution22 a = new Solution22();
        System.out.print("Enter the first number: ");
        a.num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        a.num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        a.num3 = sc.nextInt();
        a.compare();
    }
    public void compare(){
        //if any of the nums are the same, close the program
        //otherwise, compare num1 to num2 and num1 to num3. num1 is largest
        //otherwise, num1 < num2 and compare num2 to num3. num2 is largest
        //otherwise, num3 is largest
        if(num1==num2 || num2==num3 || num3==num1){
            System.out.println("Please enter 3 unique numbers. Program Closed.");
        }
        else if(num1 > num2 && num1 > num3) {
            System.out.println("Largest number is "+num1);
        }
        else if(num2 > num3) {
            System.out.println("Largest number is "+num2);
        }
        else {
            System.out.println("Largest number is "+num3);
        }
    }
}
