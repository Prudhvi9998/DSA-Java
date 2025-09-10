package com.searching.binary_search.practice.dual;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int piv = pivot(arr);
        if(piv == -1){
            return binarySearch(arr,target,0,arr.length - 1);
        }
        if(arr[piv] == target){
            return piv;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,piv);
        }else{
            return binarySearch(arr,target,piv + 1,arr.length - 1);
        }

    }
    static int binarySearch(int[] arr,int target,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
