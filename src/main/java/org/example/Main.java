package org.example;
/**
 * CSC 311 Lab 1
 * @author jordanbiggs
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Car myCar = new Car(); //creates new instance for car
        System.out.println("First car");
        myCar.displayInfo();// displays info
        //getters
        myCar.getColor();
        myCar.getEngineSize();
        myCar.getFuelType();
        myCar.getNumberOfWheels();
        //setters
        myCar.brand = "honda";
        myCar.setColor("puple");
        myCar.setEngineSize(6.0);
        myCar.setNumberOfWheels(5);
        myCar.setFuelType("Propane");

        System.out.println("Second car");
        myCar.displayInfo();// displays info for the updated car




    }
}