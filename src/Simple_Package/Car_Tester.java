package Simple_Package;

public class Car_Tester {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Black";
        car.model = "BMW";
        car.costOfPurchase = 23;

        System.out.println(car);
        Car newCar = new Car("Blue", "Mercedes", 50, 5);
        System.out.println(newCar);
    }
}
