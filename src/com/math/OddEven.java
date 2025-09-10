package com.math;

public class OddEven {
    public static void main(String[] args) {
        int n = 21;
        if((n & 1) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
