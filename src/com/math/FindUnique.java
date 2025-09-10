package com.math;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4,6};
        System.out.println(duplicate(arr));
    }
    static int duplicate(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int unique = 0;
        for(int i : arr){
            unique ^= i;
        }
        return unique;
    }


}
