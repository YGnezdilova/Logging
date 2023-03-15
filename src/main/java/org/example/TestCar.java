package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.lang.String;

public class TestCar {

    public static void main(String[] args) {
        Car carTest = new Car("Audi", "Red", 200, 230);
        Car carTest2 = new Car("Audi", "Red", 200, 230);

    }
}

class Car {
    private final String brand;
    private String color;
    private final int engineCapacity;
    private final int maxSpeed;
    static int countOfCars = 0;
    private final String[] colorOfCars = {"White", "Black", "Gray", "Silver", "Blue", "Red", "Brown", "Green", "Orange", "Beige", "Purple", "Gold", "Yellow"
    };




    Car(String brand, String color, int engineCapacity, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.maxSpeed = maxSpeed;
        Log.info("This is an INFO message about car: {}, {}, {}, {} ", brand, color, engineCapacity, maxSpeed);
        countOfCars++;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static void printCars(Car[] cars) {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%-20s%-20s%20s%20s\n", "Brand", "Color", "EngineCapacity", "Max Speed");
        System.out.println("----------------------------------------------------------------------------------------");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%-20s%-20s%20d%20d\n", cars[i].getBrand(), cars[i].getColor(), cars[i].getEngineCapacity(), cars[i].getMaxSpeed());
            System.out.println();
        }
    }


    public void SetColor(String color) {
        for (int i = 0; i < colorOfCars.length; i++) {
            if (color.equals(colorOfCars[i])) {
                this.color = color;
                ;
            }
        }
        if (color.equals("Gold")) {
            Log.error("This is an ERROR message, gold color is entered for car {}", getBrand() );
        }
        else Log.info("This is an INFO message about color change to {} for car {}", color, getBrand());


    }

    private static final Logger Log = LoggerFactory.getLogger(CarTest.class);
}






