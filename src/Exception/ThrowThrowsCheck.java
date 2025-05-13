package Exception;

import java.util.Scanner;

public class ThrowThrowsCheck {
    public static double area(int r) {
        if (r < 0) {
            throw new IllegalArgumentException("The radius cannot be negative:" + r);
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = scanner.nextInt();
        try {
            double result = area(radius);
            System.out.println("Area: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error Occurred:" + e.getMessage());
        }
        try {
            int d = divide(16, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}