/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
import java.util.Scanner;
public class Solution08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Prompt user for number of people and store
        //Prompt user for number of pizzas and store
        //Prompt user for number of slices per pizza and store
        //Calculate total number of slices (numpizza*numslicesperpizza)
        //Calculate number of slices per person (slicestotal/numpeople)
        //User modulo to find remaining slices
        System.out.print("How many people? ");
        int numPeople = sc.nextInt();
        System.out.print("How many pizzas do you have? ");
        int numPizzas = sc.nextInt();
        System.out.print("How many slices per pizza? ");
        int numSlicesPerPizza = sc.nextInt();

        int numSlicesTotal = numPizzas*numSlicesPerPizza;
        int numSlicesRemaining = numSlicesTotal%numPeople;
        int numSlicesPerPerson = numSlicesTotal/numPeople;

        System.out.println(numPeople+" people with "+numPizzas+" pizzas ("+numSlicesTotal+" slices)");
        System.out.println("Each person gets " + numSlicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + numSlicesRemaining + " leftover pieces.");

    }
}
