package Practise;

public class ClassDemo {
    public static void main(String[] args) {
        Vehicle v;

        //Reference to Car
        v = new Car();
        v.Accelerate();
        v.applyBreak();

        System.out.println("------------");
        //Reference to SportsCar
        v = new SportCar();
        v.Accelerate();
        v.applyBreak();

    }

}
