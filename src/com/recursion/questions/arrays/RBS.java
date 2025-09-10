package com.recursion.questions.arrays;

public class RBS {
    public static void main(String[] args) {
    int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(Rbs(arr,0,0,arr.length - 1));
    }
    static int Rbs(int[] arr, int target,int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]) {
                return Rbs(arr, target, s, mid - 1);
            }else {
                return Rbs(arr,target,mid + 1,e);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
            return Rbs(arr,target,mid + 1,e);
        }
        return Rbs(arr,target,s,mid - 1);
    }
}
