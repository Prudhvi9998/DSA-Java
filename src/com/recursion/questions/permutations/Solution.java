package com.recursion.questions.permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2};
        Solution obj = new Solution();
        List<List<Integer>> ans = obj.permute(nums);
        System.out.println(ans);
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList(),nums,new boolean[nums.length],result);
        
        return result;
    }

    public void backtrack(List<Integer> current, int[] nums, boolean[] used,List<List<Integer>> result){
        //base case:
        if(current.size() == nums.length){
            result.add(new ArrayList(current));
            return;
        }

        // try each number
        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }

            // chose

            current.add(nums[i]);
            used[i] = true;

            // explore furhter
            backtrack(current,nums,used,result);

            //backtrack

            current.remove(current.size() - 1);

            used[i] = false;

        }
    }
}