package com.searching.binary_search.practice;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPiv(arr);

        return pivot + 1;
    }

    private static int findPiv(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(mid < end && arr[mid] > arr[mid + 1]){
            return mid;
        }
        if(mid > start && arr[mid] < arr[mid - 1]){
            return mid - 1;
        }
        if(arr[start] >= arr[mid]){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
    return -1;

    }

}
