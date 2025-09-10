package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Example {
    public static void main(String[] args) {
        // Syntax:
        // Datatype[] variable_name = new Datatype[Size];
//        int[] roll_no = new int[5];
//        //Or directly
//        int[] rno = {12,13,14,15};

//        int[] ros; // Declaration of Array, will be defined in stack
//        ros = new int[5]; // This is initialization, actual object is created in the heap memory
//        String[] name = new String[5];
//
//        for (String ro : name) {
//            System.out.println(ro);
//        }
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 24;
//        arr[2] = 54;
//        arr[3] = 65;
//        arr[4] = 78;

    // Array of Primitives
//        System.out.println(arr[5-1]);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//            System.out.println(arr[i]);
//        }
//        for(int row: arr){
//            System.out.println(row + " ");
//        }

        //Array of Objects
        String[] str = new String[3];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
