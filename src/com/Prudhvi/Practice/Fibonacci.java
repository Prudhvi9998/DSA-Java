package com.Prudhvi.Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int num = sc.nextInt();
        int n1 = 0, n2 = 1, n3, i;

        System.out.println(n1 + " " + n2);

        for ( i = 2; i < num; i++) {
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
