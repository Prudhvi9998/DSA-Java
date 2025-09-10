package com.searching.binary_search.practice;

public class SplitArray {
    public static void main(String[] args) {
    int[] nums = {7,2,5,10,8};
    int k = 2;
        System.out.println(split(nums,k));
    }
    static int split(int[] nums, int m){
        int start = 0;
        int end = nums.length;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        //binary search
        while(start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
