package Practise;

public class Car implements Vehicle {
    private final int speedValue = 5;
    private int speed = 0;

    public void Accelerate() {
        speed += speedValue;
        System.out.println("Accelerating by " + speedValue + "Current Speed: " + speed);
    }

    public void applyBreak() {
        speed -= speedValue;
        System.out.println("Slowing down by: "+ speedValue + "Current Speed:" + speed);
    }
}
