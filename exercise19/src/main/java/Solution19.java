/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution19 {
    double weight;
    double height;
    double BMI;
    public static void main(String[] args) {
        //create object person
        //pass to read to get height and weight
        //pass to calculate BMI
        Solution19 person = new Solution19();
        person.read();
        person.calculateBMI();
    }
    public void read() {
        //prompt for weight in lbs
        //if no numerical value entered, ask again
        //if numerical, store value and continue
        //repeat process with height in inches
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your weight is lbs? ");
        while(!sc.hasNextDouble()) {
            System.out.print("What is your weight is lbs? ");
            sc.next();
        }
        weight = sc.nextDouble();
        System.out.print("What is your height in inches? ");
        while(!sc.hasNextDouble()){
            System.out.print("What is your height in inches? ");
            sc.next();
        }
        height = sc.nextDouble();
    }
    public void calculateBMI() {
        //use BMI = (weight/(height*height))*703
        //print BMI
        //if 18.5<=BMI>=25 you are healthy
        //if BMI<18.5 you are underweight
        //if BMI>25 you are overweight
        BMI = (weight/(height*height))*703;
        System.out.printf("Your BMI is %.2f.\n", BMI);
        if(BMI<18.5){
            System.out.print("You are underweight. You should see your doctor.");
        }
        else if(BMI>25){
            System.out.print("You are overweight. You should see your doctor.");
        }
        else if(BMI>=18.5){
            System.out.print("You are within the ideal weight range.");
        }
    }
}