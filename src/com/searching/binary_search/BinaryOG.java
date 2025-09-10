package com.searching.binary_search;

public class BinaryOG {
    public static void main(String[] args) {
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        System.out.println(orderAgnostic(arr,target));
    }
    static int orderAgnostic(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] <= arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
