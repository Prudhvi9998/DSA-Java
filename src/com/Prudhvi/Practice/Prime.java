package com.Prudhvi.Practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num =  input.nextInt();

        if(num <= 0){
            System.out.println("Neither prime nor composite");
            return;
        }
        int c = 2;
        while (c * c <= num){
            if(num % c == 0){
                System.out.println("Not a prime");
                return;
            }
            c += 1;
        }
        if(c * c >= num){
            System.out.println("Prime number ");
        }
    }
}
