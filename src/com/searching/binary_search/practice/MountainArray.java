package com.searching.binary_search.practice;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,2};
        System.out.println(peakIndex(arr));
    }


    private static int peakIndex(int[] arr) {
        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}
