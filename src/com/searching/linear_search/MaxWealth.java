package com.searching.linear_search;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] account = {
                {1,2,3},
                {3,2,1},
                {4,1,2}
        };
        System.out.println(maximumWealth(account));
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int person  = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;

    }


}
