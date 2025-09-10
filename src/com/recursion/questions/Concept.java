package com.recursion.questions;

public class Concept {
    public static void main(String[] args) {
    num(5);
    }
    static void num(int n){
        if( n <= 1){
            return;
        }
        System.out.println(n);
//        num(n--); This will overflow the stack because the value is passed rather than the subtraction, and it keeps on sending the value, and it will eventually overflow the stack
        num(--n); // This  will send the subtracted value first rather than the value itself.

    }
}
