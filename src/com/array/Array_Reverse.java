package com.array;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
//        rev1(arr);
        reverse1(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
//    static  void rev(int[] arr){
//        int[] arr1 = new int[arr.length];
//        for (int i = arr.length-1; i > 0; i--) {
//            arr1 = arr[i];
//            System.out.println(arr[i]);
//        }
        static void rev1(int[] arr){
            int s = 0;
            int e = arr.length - 1;
//        int[] temp = new int[arr.length];

            while(s <= e){
                int te = arr[s];
                arr[s] = arr[e];
                arr[e] = te;
                s++;
                e--;

            }
        }
        static void reverse1(int[] arr, int n){
        int[] array = new int[arr.length];
//        int j = arr.length;
        for(int i = 0; i < arr.length; i++){
            array[n - i - 1] = arr[i];


        }
        int p = 0;
        for(int value : array){
            arr[p++] = value;
        }


        }
}
