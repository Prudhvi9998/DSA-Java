package com.Prudhvi.Practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num, newNum,rev = 0;

        Scanner in = new Scanner(System.in);

        num = in.nextInt();

        newNum = num;

        while (num != 0){
            rev = num % 10 + rev * 10;
            num /= 10;
        }
        System.out.println((rev == newNum)?"Palindrome":"Not Palindrome");
    }
}
