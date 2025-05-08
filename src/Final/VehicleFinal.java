package Final;

import Inheritance.Vehicle;

public class VehicleFinal {
    final int gears = 4;

    public static void main(String[] args) {
        VehicleFinal V1 = new VehicleFinal();

    }

    int Wheelcount;
    String model;

    VehicleFinal() {
        System.out.println("Creating a vehicle instance!");
    }

    void start() {
        System.out.println("Vehicle is starting!");
    }

    final void accelerator() { //it cannot be changed or overridden
        System.out.println("Vehicle is accelerating!");
    }
}