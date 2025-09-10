package com.searching.linear_search;

public class Linear_Search {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 8, 6, 1, 4};
        int target = 1;

//        int ans = search(numbers, target);
        int ans = search2(numbers,target);
        System.out.println(ans);
    }

     static int search(int[] numbers, int target) {
        if(numbers.length == 0){
            return -1;
        }
        // This is using for loop
         int n = numbers.length;
         for(int i = 0; i < n; i++){
             if(numbers[i] == target){
                 return i;
             }
         }
         return -1;
    }
    static int search2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while(i < len){
            if(arr[i] == target){
                return i;
            }
            i++;
        }
        return Integer.MAX_VALUE;
    }

}
