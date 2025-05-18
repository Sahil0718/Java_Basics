package Exception;

import java.util.Scanner;

public class CustomizedException extends RuntimeException {
    public CustomizedException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        try {
            if (age < 28) {
                throw new CustomizedException("You are not eligible for voting!");
            } else {
                System.out.println("You can vote successfully!");
            }
        } catch (CustomizedException e) {
            e.printStackTrace();
        }
    }
}
