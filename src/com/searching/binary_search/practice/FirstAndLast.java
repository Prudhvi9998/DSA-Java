package com.searching.binary_search.practice;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target,true);
        if(ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }
    static int search(int[] arr,int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;
                if(isFirst){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
