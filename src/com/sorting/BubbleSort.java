package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {3,1,5,4,2};
        int[] arr = {1,2,3,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        if(arr.length == 0){
            return;
        }
        int temp = 0;
        boolean swapped;

        for(int i = 0; i < arr.length - 1;i++){
            swapped = false;
            for(int j = 1; j < arr.length - i;j++){
                if(arr[j] < arr[j - 1]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;


                }
            }
            if(!swapped){
                break;
            }
        }

    }

}
