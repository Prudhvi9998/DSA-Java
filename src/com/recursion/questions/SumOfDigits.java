package com.recursion.questions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(13422));
    }
    static int sumOfDigits(int n){
        if(n < 1){
            return n;
        }


        return (n % 10) + sumOfDigits(n / 10);

    }
}
