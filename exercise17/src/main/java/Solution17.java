/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution17 {
    int sex;
    int alcoholInOz;
    int weightInLbs;
    int hoursSinceLastDrink;
    double BAC;
    double sexRatio;
    public static void main(String[] args) {
        //creates new object person
        //calls person() to get info about alcohol consumption
        //calls calcBAC() to calculate BAC
        Solution17 newPerson = new Solution17();
        newPerson.person();
        newPerson.calculateBAC();
    }
    public void person() {
        //are you male or female?
        //if male ratio .73 is female ratio .66
        //how much alcohol did you consume?
        //what is your weight in lbs?
        //how many hours since last drink?
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        sex = Integer.parseInt(sc.next());
        if(sex==1)
            sexRatio = 0.73;
        else if(sex==2)
            sexRatio = 0.66;
        System.out.print("How many ounces of alcohol did you have? ");
        alcoholInOz = Integer.parseInt(sc.next());
        System.out.print("What is your weight, in pounds? ");
        weightInLbs = Integer.parseInt(sc.next());
        System.out.print("How many hours has it been since your last drink? ");
        hoursSinceLastDrink = Integer.parseInt(sc.next());
    }
    public void calculateBAC() {
        //BAC = (A × 5.14 / W × r) − .015 × H
        //you are legal if BAC < 0.08
        //you are not legal if BAC >= 0.08
        BAC = (alcoholInOz * 5.14 / weightInLbs * sexRatio) - 0.015 * hoursSinceLastDrink;
        if(BAC<0.08)
            System.out.printf("Your BAC is %.6f\nIt is legal for you to drive.", BAC);
        else
            System.out.printf("Your BAC is %.6f\nIt is not legal for you to drive.", BAC);
    }
}
