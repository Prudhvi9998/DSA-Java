package com.recursion.strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "abccdah");
        System.out.println(skip1("abbccdaha"));
        System.out.println(skipNotApple("abcadappledah"));
    }
    static void skip(String pr,String up){
        if(up.isEmpty()){
            System.out.println(pr);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(pr, up.substring(1));

        }else{
            skip(pr + ch, up.substring(1));
        }
    }

    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip1(up.substring(1));
        }else{
            return ch + skip1(up.substring(1));
        }
    }


    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipNotApple(up.substring(1));
        }
    }
}
