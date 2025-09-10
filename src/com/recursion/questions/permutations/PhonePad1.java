package com.recursion.questions.permutations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class PhonePad1 {
    public static void main(String[] args) {
        System.out.println(letterCombination("79"));
    }
    public static List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        HashMap<Character,String> hash=new HashMap<>();
        hash.put('2',"abc");
        hash.put('3',"def");
        hash.put('4',"ghi");
        hash.put('5',"jkl");
        hash.put('6',"mno");
        hash.put('7',"pqrs");
        hash.put('8',"tuv");
        hash.put('9',"wxyz");

        res.add("");
        for(int i=0;i<digits.length();i++){
            char dig=digits.charAt(i);
            String let=hash.get(dig);

            List<String> temp=new ArrayList<>();

            for(String com:res){
                for(int j=0;j<let.length();j++){
                    temp.add(com+let.charAt(j));
                }
            }
            res=temp;
        }
        return res ;
    }



    // This approach is processed and unprocessed
    static HashMap<Character, String> hash = new HashMap<>();
    public static List<String> letterCombination(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        // Initialize the HashMap with the correct mappings
        hash.put('2', "abc");
        hash.put('3', "def");
        hash.put('4', "ghi");
        hash.put('5', "jkl");
        hash.put('6', "mno");
        hash.put('7', "pqrs");
        hash.put('8', "tuv");
        hash.put('9', "wxyz");

        // Start the recursion with an empty processed string and the full digits string
        return padRet("", digits);
    }

    // Your modified recursive method
    private static List<String> padRet(String p, String up) {
        // Base Case: If the unprocessed string is empty, we have a complete combination.
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Get the letters for the current digit
        char digit = up.charAt(0);
        String letters = hash.get(digit);

        List<String> ans = new ArrayList<>();

        // Iterate through each letter and make a recursive call
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            // Recursively call with the updated processed and unprocessed strings
            ans.addAll(padRet(p + ch, up.substring(1)));
        }
        return ans;
    }
}



