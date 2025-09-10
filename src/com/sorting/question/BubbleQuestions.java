package com.sorting.question;

import java.util.Arrays;

public class BubbleQuestions {
    public static void main(String[] args) {
    int[] arr = {5,1,4,2,8};
    int[] arr1 = {1,2,3,4,5};
        System.out.println(sorted(arr1));
//        System.out.println(desc(arr));
//        System.out.println(Arrays.toString(arr));
//        int min = arr.length;
//        System.out.println(smallest(arr,min));

    }
//    static int desc(int[] arr){
//        if(arr.length ==0){
//            return -1;
//        }
//        boolean swapped;
//        int counter = 0;
//        for(int i = 0; i < arr.length - 1; i++){
//            swapped = false;
//            for(int j = 0; j < arr.length - i - 1; j++){
//                if(arr[j] < arr[j + 1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                swapped = true;
//                counter += 1;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//            System.out.println(Arrays.toString(arr));
//
//        }
//        return counter;
//    }

    public static int smallest(int[] arr, int k){
        if(arr.length ==0){
            return -1;
        }
        for(int i = 0; i < arr.length - 1; i++){

            for(int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        return arr[k % arr.length];
    }
    static boolean sorted(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    swapped = true;
                    break;
                }
            }
            if(!swapped){
                return true;
            }
        }
        return false;
    }

}
