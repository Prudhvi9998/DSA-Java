package com.strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        int[] arr1 = arr.clone();
        int a = 10;
        int b = a;
        System.out.println(a + " " + b);
        a = 100;
        System.out.println(a + " " + b);
        arr1[1] = 10;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));
        String name = "Lilly";
        String naam = name;
        System.out.println(name + " " + naam);
        name = "Lilly**2";
        System.out.println(name + " " + naam);

    }
}
