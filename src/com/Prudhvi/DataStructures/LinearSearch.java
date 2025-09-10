package com.Prudhvi.DataStructures;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {20,23,25,258,25,256};
        System.out.println(search(arr));
        System.out.println(minValue(arr));
    }
    static int search(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        //Finding maximum and minimum in an array
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }

        }

//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target){
////                return i;
//            count++;
//            }
//        }
//        return count;
        return max;
    }
    static int minValue(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

}
