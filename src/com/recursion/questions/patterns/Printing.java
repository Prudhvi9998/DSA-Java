package com.recursion.questions.patterns;

public class Printing {
    public static void main(String[] args) {
        triangle(5,0);
    }
    static void star(int n){
        if(n == 0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        star(n - 1);
    }
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            triangle(r, c + 1);
            System.out.print(" * ");

        }else{
            triangle(r - 1, 0);
            System.out.println();

        }
    }
}
