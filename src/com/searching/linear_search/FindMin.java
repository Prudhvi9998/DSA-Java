package com.searching.linear_search;

public class FindMin {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 8, 6, 1, 4,-2};
        System.out.println(min(numbers));

    }
    static int min(int[] arr){
        int low = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < low){
                low = arr[i];
            }
        }
        return low;
    }
}
