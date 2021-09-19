/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution15 {
    final String knownUser1 = "user1";
    final String knownPass1 = "abc$123";
    String username;
    String password;
    public static void main(String[] args) {
        //creates new identity checker
        //pass to read() to get username and password from user
        //pass to compareInputOutput() to check if user and pass are correct
        Solution15 checker = new Solution15();
        checker.read();
        checker.compareInputOutput();
    }
    public void read() {
        //take input for username
        //take input for password
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your username? ");
        username = sc.next();
        System.out.print("What is the password? ");
        password = sc.next();
    }
    public void compareInputOutput() {
        //if the username and password user gave match username and password in database "Welcome!"
        //otherwise if the username or password to not match, "I don't know you"
        if(knownUser1.equals(username) && knownPass1.equals(password))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }
}