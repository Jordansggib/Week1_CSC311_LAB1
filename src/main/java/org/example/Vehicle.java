package org.example;

/**
 * CSC 311 Lab 1
 * @author jordanbiggs
 */
public class Vehicle {
    /**
     * Public Variables
     */
    int numberOfWheels;
    String color;
    double engineSize;
    String fuelType;

    /**
     * Default constructor for the vehicle class
     */
    public Vehicle(){
        numberOfWheels = 0;
        color = null;
        engineSize = 0.0  ;
        fuelType = null;
    }

    /**
     *  Getter for the number wheels
     * @return the number of wheels for the current instance
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    /**
     *  Getter for the color
     * @return the color for the current instance
     */
    public String getColor(){
      return color;
    }
    /**
     *  Getter for the engine size
     * @return the engine size  for the current instance
     */
    public double getEngineSize(){
        return engineSize;
    }
    /**
     *  Getter for the fuel type
     * @return the fuel type for the current instance
     */
    public String getFuelType(){
        return fuelType;
    }
    /**
     *  Setter for the number of wheels
     * sets the number of wheels for this instance
     */
    void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    /**
     *  Setter for the color
     * sets the color  for this instance
     */

    void setColor(String color){
        this.color = color;
    }
    /**
     *  Setter for the engine size
     * sets the engine size  for this instance
     */
    void  setEngineSize(double engineSize){
        this.engineSize = engineSize;
    }
    /**
     *  Setter for fuel type
     * sets the fuel type for this instance
     */
    void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
}
