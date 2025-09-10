package com.Prudhvi.Poly;

public class Rectangle extends Shape {
    private double length;
    private double width;


    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double cal_Area(){
        return length * width;
    }
    @Override
    public double cal_Perimeter(){
        return 2 * (length + width);
    }
}
