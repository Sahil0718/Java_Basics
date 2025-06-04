package Practise;

public class SportCar implements Vehicle {
    private final int speedValue = 10;
    private int speed = 0;

    public void Accelerate() {
        speed += speedValue;
        System.out.println("Accelerating by " + speedValue + "Current Speed: " + speed);
    }

    public void applyBreak() {
        speed -= speedValue;
        System.out.println("Slowing Down by " + speedValue + "Current Speed: " + speed);
    }
}
