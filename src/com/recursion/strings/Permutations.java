package com.recursion.strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        ArrayList<String> ans = permutationsList("","abc");
//        System.out.println(ans);
        System.out.println(permutationCount1("","abc",0));
     }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }
    static ArrayList<String> permutationsList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());

            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
    static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());

            count = count + permutationCount(f + ch + s, up.substring(1));

        }
        return count;
    }

    static int permutationCount1(String p, String up, int count){
        if(up.isEmpty()){
            return count + 1;
        }
        int total = count;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());

            count = count + permutationCount1(f + ch + s, up.substring(1),total);

        }
        return total;
    }
}
