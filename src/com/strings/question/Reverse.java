package com.strings.question;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String str = " hello Prudhvi";
        System.out.println(rev(str));
        System.out.println(rev1(str));
//        System.out.println(vowel(str));
    }

    private static String rev(String str) {
        if(str == null){
            return null;
        }
//        StringBuilder sb = new StringBuilder();
        String sb = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            sb = sb  + ch;
        }
        return new String(sb);
    }
    static String rev1(String str){
        if(str == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(str.length() - i - 1);
            sb.append(ch);
        }
        return sb.toString();
    }
    static int vowel(String str){
        if(str == null || str.length() == 0){
            return -1;
        }
        int count = 0;
//        StringBuilder vow = new StringBuilder();
//        String st = "aeiou";
//        char[] vowels = st.toCharArray();
//        for (int i = 0; i <= str.length() - 1; i++) {
//            char ch = str.charAt(i);
//            if(ch == 'a' || ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u'){
//                count++;
//            }
        for (char ch : str.toLowerCase().toCharArray()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ) {
            switch(ch){
                case 'a' : case 'e' : case 'i' : case 'o' : case 'u':
                    count++;
        }

        }
        if(count != 0){
            return count;
        }
        return -1;
    }
}
