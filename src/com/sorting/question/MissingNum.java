package com.sorting.question;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
    int[] arr = {4,0,2,1};
//        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(sort(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int j = 0;j < arr.length;j++){
            if(arr[j] != j){
                return j;
            }
        }

        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
