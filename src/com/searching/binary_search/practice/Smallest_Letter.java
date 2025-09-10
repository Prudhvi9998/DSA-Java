package com.searching.binary_search.practice;

public class Smallest_Letter {
    public static void main(String[] args) {
    char[] letters = {'c','f','j','i','k','m','p'};
    char target = 'h';
        System.out.println(nextGreatest(letters,target));
    }
    public static char nextGreatest(char[] arr, char target){
        if(arr == null){
            return '0';
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
