/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brian Reed
 */
public class Solution14 {
    public static void main(String[] args) {
        //makes new object for class order
        //goes to method order.read to get input
        //Order class has special case if state is WI
        //otherwise go to order.print to get order total
        Order order = new Order();
        order.read();
        order.print();
    }
}
