package com.searching.binary_search.practice;

public class Infinite_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 170;
        System.out.println(ans(arr, target));
    }

    private static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
try{
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }}catch(Exception e){
        end = end - 1;
    }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
    if(arr.length == 0){
        return -1;
    }
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
    return -1;
    }
}
