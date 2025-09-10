package com.array;
import java.lang.reflect.Array;
import java.util.*;

public class MutliDimenstion {
    /*
    1 2 3
    4 5 6
    7 8 9
     */
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        //Input

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }


        }
        for (int ro = 0; ro < arr.length; ro++) {
            for (int co = 0; co < arr[ro].length; co++) {
                System.out.print(arr[ro][co] + " ");

            }
            System.out.println();

        }

        // Array output using Arrays.toString
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        for(int[] ar: arr){
            System.out.println(Arrays.toString(ar));
        }
    }
}
