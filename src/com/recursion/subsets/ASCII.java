package com.recursion.subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
        // This is how we get ascii value
        char ch = 'a';
//        System.out.println(ch + 0);
//        subseqAscii("","ab");
        System.out.println(subAscii("", "abc"));
    }


    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }


    static ArrayList<String> subAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subAscii(p + ch, up.substring(1));
        ArrayList<String> second = subAscii(p, up.substring(1));
        ArrayList<String> third = subAscii(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
