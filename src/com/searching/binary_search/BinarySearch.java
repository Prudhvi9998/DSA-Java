package com.searching.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
    int target = 16;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // find middle element
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return -1;
    }
}
