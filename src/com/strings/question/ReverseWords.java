package com.strings.question;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello Prudhvi";
        System.out.println(reverseWords(str));
    }
    static String reverseWords(String str) {
       if(str == null || str.isEmpty()){
           return str;

        }
       char[] words = str.toCharArray();
       int start = 0;
        for (int i = 0; i <= words.length; i++) {
            if(i == words.length || words[i] == ' '){
                reverse(words,start,i-1);
                start = i + 1;
            }
        }

        return new String(words);
    }

    static void reverse(char[] arr, int left, int right) {
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

}
}
