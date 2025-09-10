package com.math;

public class Power {
    public static void main(String[] args) {
        int n = 3;
        int base = 3;
        int power = 9;
        System.out.println(power(base,power));

    }

    private static boolean isPower(int n) {

        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
    static int power(int base, int power){
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        return ans;
    }
}
