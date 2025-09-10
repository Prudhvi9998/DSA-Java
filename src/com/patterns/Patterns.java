package com.patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 3;
        pattern31(n);
    }
    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = n; col >= 1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 0; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1; row <= n;row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");

            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        int rowIndex= 0;
        for(int row = 0; row < 2 * n; row++){
//            if(row > n){
//                 rowIndex = 2 * n - row;
//            }else{
//                rowIndex = row;
//            }
            rowIndex = row > n ? 2 * n - row  : row;
            for(int col = 0; col < rowIndex;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n ){
        for(int row = 0; row < 2 * n; row++){
            int totalRows = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalRows;
            for(int s = 0; s < totalSpaces; s++){
                System.out.print(" ");
            }

            for(int col = 0; col < totalRows; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int spa = 0; spa < spaces; spa++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col1 = 2; col1 <= row ; col1++) {
                System.out.print(col1);
            }
            System.out.println();
        }

    }
    static void pattern33(int n){
        char ch =0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char)('a' + ch) + " ");
                    ch++;
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for(int space = 0; space < n - c;space++){
                System.out.print("  ");
            }
            for(int col = c; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= c; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2 * n;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col <= n; col++){
                int atEveryIndex =  originalN - Math.min(Math.min(row,col), Math.min(n-row,n-col)) + 1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
