package com.math;

public class Prime {
    public static void main(String[] args) {
    int i = 31;
        System.out.println(isPrime(i));
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c  = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
                }
            c++;
            }
        return true;
        }
    }

