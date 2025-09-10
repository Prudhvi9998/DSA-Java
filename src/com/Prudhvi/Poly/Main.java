package com.Prudhvi.Poly;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(10);
        int temp = (int) Math.round(s.cal_Area());
        System.out.println(temp);
    }
}
