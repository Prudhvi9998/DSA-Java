package com.recursion;

public class RecurExamples {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n == 5){
            System.out.println(5);
            return;

        }
        System.out.println(n);
        // This is known as tail recursion
        // this is the last function call
        print(n + 1);
    }
}
