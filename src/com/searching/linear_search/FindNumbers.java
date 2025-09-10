package com.searching.linear_search;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class FindNumbers {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771,12};
        int ans = num(nums);
        System.out.println(ans);
    }

    private static int num(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int count = 0;
        for(int i: nums){
            if(digits(i)){
                count++;
            }
        }
        return count;
    }

//    private static boolean even(int i) {
//        int ans = digits(i);
//        return ans % 2 == 0;
//    }

    private static boolean digits(int i) {
        if(i < 0){
            i *= -1;
        }
        int count = 0;
        while(i > 0){
            count++;
            i /= 10;
        }
        return count % 2 == 0;
    }


}
