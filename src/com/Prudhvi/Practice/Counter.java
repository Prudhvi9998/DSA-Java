package com.Prudhvi.Practice;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        int input = 0;
        int large = 0;

        System.out.println("Enter a series of values (0 to quit): ");
        Scanner in = new Scanner(System.in);

        while((input = in.nextInt()) != 0){
            if(input != 0){
                sum = input + sum;
                counter++;
            }
            if(input > large){
                large = input;
            }
        }
        System.out.println("Total number of integers entered is " + counter);
        System.out.println("The largest integer is " + large);
        System.out.println(sum);
    }
}
