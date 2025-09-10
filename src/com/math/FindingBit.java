package com.math;

public class FindingBit {
    public static void main(String[] args) {
    int num = 13;
    int index = 2;
//        System.out.println(bit(num,index));
//        System.out.println(setBit(num,index));
//        System.out.println(reset(num,index));
        System.out.println(rightMost(num));
    }

    static boolean bit(int n, int index){

        return (n & (1 << index)) != 0;
    }
    static int setBit(int n, int index){
        return (n | (1 << index));
    }
    static int reset(int n,int index){
        return n & ~(1 << index);
    }
    static int rightMost(int n){
        if(n == 0){
            return -1;
        }
        return n & -n;

    }
}
