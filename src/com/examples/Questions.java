package com.examples;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int input = in.nextInt();
//        System.out.println(isPrime(input));
//        int arm = in.nextInt();
//        System.out.println(isArmstrong(arm));

        for(int i = 100; i <= 1000; i++){
            if(isArmstrong(i)){
                System.out.println("It is armstrong number " + i);
            }
        }

    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return (c * c > n);
    }
    // Question 2 ArmStrong number
    static boolean isArmstrong(int num){
        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            sum = (int)(sum + Math.pow(rem, digits));

        }
        return sum == temp;
    }

}
