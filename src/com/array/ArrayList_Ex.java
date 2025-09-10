package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Ex {
    public static void main(String[] args) {
        /*
        Syntax:
         */
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(256);
        list.add(25);
        list.add(26);
        list.add(56);
        list.add(156);
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }

    }
}
