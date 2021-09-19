/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;
public class Solution16 {
    int age;
    public static void main(String[] args) {
        //pass to read to get input
        //pass to checkAge to compare and output
        Solution16 person = new Solution16();
        person.read();
        person.checkAge();
    }
    public void read() {
        //prompt for user age
        //store user age
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = sc.nextInt();
    }
    public void checkAge() {
        //use a ternary operator to build string
        //output based on user age
        String result = (age>=16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);
    }
}
