package com.searching.practice;

public class Questions {
    public static void main(String[] args) {
        /*
        Problem: Write a Java program to perform a linear search to find a given element in an array. \
        Return the index of the element if found, otherwise return -1.
        Input: arr = [5, 3, 8, 2, 7], target = 8
        Output: 2
        Input: arr = [5, 3, 8, 2, 7], target = 4
        Output: -1
         */
//
        int[] arr = {5,3,8,2,7};
        int target = 8;
        int ans = search(arr,target);
        System.out.println(ans);
        System.out.println(search3(arr,target));
        int[] arr1 = {1, 4, 2, 4, 7, 4};
        int target1 = 4;
        System.out.println(searchOcc(arr1,target1));
        System.out.println(lastOccurence(arr1,target1));
    }

     static int search(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int searchOcc(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int counter = 0;
        int len = arr.length - 1;
        int i = 0;
        while(i <= len){
            if(arr[i] == target){
                counter++;
            }
            i++;
        }
        return counter;
    }
    public static int lastOccurence(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int lastIndex = -1;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == target){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    static boolean search3(int[] arr, int target) {
        if(arr.length == 0){
            return false;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
