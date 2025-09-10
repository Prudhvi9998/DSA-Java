package com.sorting.question;

public class FindDuplicates {
    public static void main(String[] args) {
    int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int duplicates(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }

        return -1;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
       static public int findDuplicate(int[] nums) {
            int slow = nums[0];
            int fast = nums[0];
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);
            slow = nums[0];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
    }

