package com.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(search(arr,30,0,arr.length -1));
    }
    static int search(int[] arr, int target, int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return search(arr,target,start,mid-1);
        }
            return search(arr,target,mid + 1,end);


    }
}
