package com.recursion.questions;

public class Reverse {
    public static void main(String[] args) {
    int ans = rev(1432);
        System.out.println(ans);
    }
    static int rev(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);
    }

    private static int helper(int n, int base) {
        if(n% 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,base - 1)) + helper(n/10,base - 1);
    }
}
