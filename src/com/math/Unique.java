package com.math;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 3, 3, 6, 6};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr){
    int result = 0;
    //Check all 32 bits (for int range)
    for(int i = 0; i < 32; i++){
        int sum = 0;
        int mask = 1 << i; // Make a mask like 0001,0010,0100 etc.

        // Count how many numbers have this bit.
        for(int num : arr){
            if((num & mask) != 0){
                sum++; // Count if bit is set.
            }
        }
        // If sum is not divisible by 3, this bit belongs to the unique number.
        if(sum % 3 != 0){
            result |=  mask; // Turn that bit ON in the result.
        }
    }
    return result;
    }
}
