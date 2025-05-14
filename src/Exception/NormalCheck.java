package Exception;


import java.util.Scanner;

public class NormalCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.println("Enter the denominator: ");
        int denominators = scanner.nextInt();
        try {
            System.out.println(divide(numerator, denominators));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Well Done!");
}

public static int divide(int a, int b) {
    return a / b;
}
    }