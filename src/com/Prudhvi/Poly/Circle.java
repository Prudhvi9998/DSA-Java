package com.Prudhvi.Poly;

public class Circle extends Shape{
    private double radius;

    public Circle(double getRadius){
        this.radius = getRadius;
    }
    @Override
    public double cal_Area(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double cal_Perimeter(){
        return 2 * Math.PI * radius;
    }
}
