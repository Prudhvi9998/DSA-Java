package com.searching.practice;

public class FirstOccurrence {
    public static void main(String[] args) {
    int[] arr = {1, 2, 2, 2, 3};
    int target = 2;
        System.out.println(occurrence(arr,target));
    }
    static int occurrence(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
//                if (mid == 0 || arr[mid - 1] != target){
                if(mid == arr.length - 1 || arr[mid + 1] != target){
                    return mid;
                } else {
                    start = start + 1;
                }
            }

                else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }






        return -1;
    }
}
