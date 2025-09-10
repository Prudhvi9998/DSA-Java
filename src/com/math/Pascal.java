package com.math;

public class Pascal {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            int sum = 1 << i;
            System.out.println(i + "\t" + sum);
        }
    }
}
