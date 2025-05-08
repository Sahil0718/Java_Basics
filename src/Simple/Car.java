package Simple;

import Inheritance.Vehicle;

public class Car extends Vehicle {
    String color;

    @Override
    public void commute() {
        super.commute();
        System.out.println("The vehicle is starting!");

    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle v1 = new Vehicle();
        v1.noOfTyres = 8;
        v1.commute();
        c1.commute();

    }
}