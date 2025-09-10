package com.recursion.questions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(101));
    }
    static int rev(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    static int helper(int n, int base){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,base - 1)) + helper(n / 10, base - 1);
    }
    static boolean palin(int n){
        return n == rev(n);
    }
}
