package com.company;

import java.util.Objects;

enum Colors {green, red, black};

public abstract class Car implements IAccelerate {
    protected Colors color;
    protected String model;
    protected String typeOfBox;
    protected int capacity;
    protected int speed = 0;

    public Car(Colors color, String model, String typeOfBox, int capacity) {
        this.color = color;
        this.model = model;
        this.typeOfBox = typeOfBox;
        this.capacity = capacity;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfBox() {
        return typeOfBox;
    }

    public void setTypeOfBox(String typeOfBox) {
        this.typeOfBox = typeOfBox;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int accelerate() {
        speed = speed + 5;
        return speed;
    }

    public int switchSpeed(int numberOfspeeds, int gear) {
        System.out.println("Car has box with " + numberOfspeeds + " speeds.");
        return gear;
    }

    public void switchSpeed() {
        System.out.println("Car has a automatical box");
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append("color = ").append(color);
        sb.append(", model = ").append(model);
        sb.append(", typeOfBox = ").append(typeOfBox);
        sb.append(", capacity = ").append(capacity);
        sb.append(", speed = ").append(speed);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.capacity, capacity) == 0 &&
                speed == car.speed &&
                color.equals(car.color) &&
                model.equals(car.model) &&
                typeOfBox.equals(car.typeOfBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, typeOfBox, capacity, speed);
    }
}
