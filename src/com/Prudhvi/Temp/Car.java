package com.Prudhvi.Temp;

public class Car extends Vehicle {
    int numDoors;
    Boolean isConvertible;

    public Car(String make,String model,int numDoors,Boolean isConvertible) {
        super(make,model);
        this.numDoors = numDoors;
        this.isConvertible = isConvertible;

    }
    @Override
    void display(){
        System.out.println("The car maker is " + getMake() + "car model is " + getModel() + " doors" + numDoors + " is it convertible" +isConvertible);
    }
}
