package com.Prudhvi.Practice;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in INR : ");
        double inr = sc.nextInt();
        double usd = inr * 0.013;
        System.out.println("The Value of USD : " + usd);
        sc.close();
    }
}
