package com.searching.linear_search;

public class SearchStr {
    public static void main(String[] args) {
        String name = "prUdhvi";
        char target = 'u';
        System.out.println(search(name,target));
    }
    static boolean search(String name, char target){
        if(name.length() == 0){
            return false;
        }
        String naam = name.toLowerCase();

        for (int i = 0; i < naam.length(); i++) {
            if(naam.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
