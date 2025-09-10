package com.recursion.questions;

public class Count {
    public static void main(String[] args) {
        System.out.println(count(0));
    }
    static int count(int n){
        if(n == 0){
            return 1;
        }
        return helper(n, 0);
    }
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}
