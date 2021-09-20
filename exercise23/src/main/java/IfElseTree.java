/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class IfElseTree {
    //Is the car silent when you turn the key? split paths 1 and 2
    //path 1 Are the battery terminals corroded? if yes, clean the terminals. if no, replace cables.
    //path 2 Does the car make a slicking noise? if yes, replace the battery. if no, split path 3.
    //path 3 Does the car crank up but fail to start? if yes, Check spark plug connection. if no, split path 4.
    //path 4 Does the engine start and then die? if yes, split path 5.
    //path 5 Does your car have fuel injection? if yes, Get in it for service. if no, Check to ensure the choke is opening and closing.
    //path 6 This should not be possible.
    public void tree(){
        Scanner sc = new Scanner(System.in);
        char input;
        System.out.print("Is the car silent when you turn the key? ");
        input = sc.next().charAt(0);
        if (input == 'y') {
            System.out.print("Are the Battery terminals corroded? ");
            input = sc.next().charAt(0);
            if (input == 'y')
                System.out.println("Clean the terminals and try starting again.");
            else
                System.out.println("Replace cables and try again");
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            input = sc.next().charAt(0);
            if (input == 'y')
                System.out.println("Replace the Battery.");
            else {
                System.out.print("Does the car crank up but fail to start? ");
                input = sc.next().charAt(0);
                if (input == 'y')
                    System.out.println("Check spark plug connection.");
                else {
                    System.out.print("Does the engine start and then die? ");
                    input = sc.next().charAt(0);
                    if (input == 'y') {
                        System.out.println("Does your car have fuel injection? ");
                        input = sc.next().charAt(0);
                        if (input == 'y')
                            System.out.println("Get in it for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else
                        System.out.println("This should not be possible.");
                }
            }
        }
    }
}
