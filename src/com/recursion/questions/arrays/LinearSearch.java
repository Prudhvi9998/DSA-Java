package com.recursion.questions.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
    int[] arr = {1,5,6,8,9,5,10,11,5,15};
    int target = 5;
//        System.out.println(searchIndexLast(arr,target,arr.length - 1));
//
//        findAll(arr,target,0);
//        System.out.println(list);
        ArrayList<Integer> ans = findAllIndex1(arr,target,0);
        System.out.println(ans);
    }
    static boolean search(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || search(arr,target,index + 1);
    }
    static int searchIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return searchIndex(arr,target,index + 1);
        }

    }
    static int searchIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return searchIndexLast(arr,target,index - 1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }

        findAll(arr,target,index + 1);
    }

    static void findAll1(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }

        findAll(arr,target,index + 1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr,target,index + 1, list);
    }

    /**
     This is not an optimal solution, as this will create multiple ArrayList objects.
     */
    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCall = findAllIndex1(arr,target,index + 1);
        list.addAll(ansFromBelowCall);

        return list;
    }

}
