package com.searching.linear_search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 8, 6, 1, 4};
//        int[] arr;
        int start = 0;
        int end = numbers.length - 1;
        int target = 1;
        System.out.println(search(numbers,start,end, target));
    }
    static int search1(int[] arr, int s, int e, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = s; i < e; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int search(int[] arr,int start,int end, int target){
        if(arr.length == 0){
            return -1;

        }
        int st = start;
        int en = end;
        while(st <= en){
            if(arr[st] == target){
                return st;
            }
            if(arr[en] == target){
                return en;
            }
            st++;
            en--;

        }

        return -1;
    }
}
