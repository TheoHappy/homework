package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws CapacityException {
        Man Vladimir = new Man("Vladimir", 45);
        Man Valodea = new Man("Vladimir", 45);
        Man Andrei = new Man("Andrei", 40);
        Man[] pass = new Man[]{new Man("Pavel", 17), new Man("Ilie", 23)};
        Man[] pass1 = new Man[]{new Man("Alexei", 17), new Man("Ion", 23), new Man("Alina", 28)};
        // Car car1 = new Car(Colors.green, "corsa", "automat", 2);
        // Car car2 = new Car(Colors.black, "camry", "manual", 6);
        Car MercedesBenzG65 = new Mercedes(Colors.red, "G-65", "manual", 6, Vladimir, pass);
        Car MercedesBenzG55 = new Mercedes(Colors.black, "G-55", "manual", 8, Andrei, pass);
        System.out.println("Vladimir equals Valodea = " + Vladimir.equals(Valodea));
        System.out.println("Vladimir ==  Valodea " + (Valodea == Vladimir));
        System.out.println("MercedesBenzG65 equals MercedesBenzG55 = " + MercedesBenzG65.equals(MercedesBenzG55));
        System.out.println("MercedesBenzG65 ==  MercedesBenzG55 " + (MercedesBenzG65 == MercedesBenzG55));

        if (pass.length > MercedesBenzG65.getCapacity()) {
            throw new CapacityException("Capacitatea autoturismului nu corespunde cu numarul de pasageri");
        } else {
            System.out.println(MercedesBenzG65.toString());
        }
        System.out.println("Gear = " + MercedesBenzG65.switchSpeed(5, 2));

        System.out.println("This car accelerate with " + MercedesBenzG65.accelerate() + "km/h");
    }
}
