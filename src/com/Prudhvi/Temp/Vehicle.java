package com.Prudhvi.Temp;

public class Vehicle {
    private String make;
    private String model;
    Vehicle(String carMake, String carModel){
        this.make = carMake;
        this.model = carModel;
    }



    public String getMake() {
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }



//
    void display(){
        System.out.println("The car maker is " + make + "car model is " +model);
    }


}
