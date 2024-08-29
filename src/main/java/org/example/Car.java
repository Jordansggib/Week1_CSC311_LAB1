package org.example;

/**
 *  Car class inherits all methods from vehicle
 */
public class Car extends Vehicle{
   // public string variable
    String brand;

    /**
     * Method that prints Honk to
     */
    public void honk(){
        System.out.println("Honk, honk!");
    }

    /**
     * Displays the information stored in each variable
     */
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Fuel type " + fuelType);
        System.out.println("Engine " + engineSize);
    }

}
