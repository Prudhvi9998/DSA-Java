package com.recursion.subsets;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//    subseq("","abc");
    ArrayList<String > list = new ArrayList<>();
        System.out.println(subseqAdd("","abc", list));
//        System.out.println(subAdd("" , "abc"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + ",");
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqAdd(String p, String up, ArrayList<String> list){

        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

         subseqAdd(p + ch, up.substring(1),list);
         subseqAdd(p, up.substring(1),list);
        return list;

    }

    static ArrayList<String> subAdd(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subAdd(p + ch, up.substring(1));
        ArrayList<String> right = subAdd(p, up.substring(1));
        left.addAll(right);
        return left;

    }
}
