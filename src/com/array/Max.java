package com.array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        int max_Index = arr[0];
        System.out.println(max(arr,max_Index));
    }
    static int max(int[] arr, int maxI){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxI){
                maxI = arr[i];
            }
        }
        return maxI;
    }
}
