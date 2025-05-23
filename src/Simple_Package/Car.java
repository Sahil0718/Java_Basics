package Simple_Package;

public class Car {
    public String color;
    public String model;
    private double fuelLevel;
    long costOfPurchase;

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model=" + model +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }

}

