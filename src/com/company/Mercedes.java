package com.company;

public class Mercedes extends Car implements IAccelerate{
    private Man driver;
    private Man passengers[];

    public Mercedes(Colors color, String model, String typeOfBox, int capacity, Man driver, Man[] passengers) {
        super(color, model, typeOfBox, capacity);
        this.driver = driver;
        this.passengers = passengers;
    }

    public Man getDriver() {
        return driver;
    }

    public void setDriver(Man driver) {
        this.driver = driver;
    }

    public Man[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Man[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public int accelerate() {
        speed += 20;
        return speed;
    }

    @Override
    public String toString() {
        return "driver's " + driver
                + ", Number of passengers = " + passengers.length
                + ", model of car = Mercedes-Benz " + model
                + ", color = " + color
                + ", type of box = " + typeOfBox
                + ", capacity = " + capacity;
    }
}
