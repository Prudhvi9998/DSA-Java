package com.searching.binary_search.practice;

public class SearchInsertPos {
    public static void main(String[] args) {
    int[] arr = {1,3,5,6};
        System.out.println(search(arr,7));
    }
    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
