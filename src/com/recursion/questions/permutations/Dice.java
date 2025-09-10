package com.recursion.questions.permutations;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceRet("", 4));
    }

    static void dice(String p, int target){
        if(target ==0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target;i++){
            dice((p + i),target - i);
        }
    }
    static List<String> diceRet(String p, int target){
        if(target ==0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target;i++){
            ans.addAll(diceRet((p + i),target - i));
        }
        return ans;
    }



    static void diceFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }

    static ArrayList<String> diceFaceRet(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceRet(p + i, target - i, face));
        }
        return list;
    }
}
