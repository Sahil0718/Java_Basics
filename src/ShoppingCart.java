import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        String item;
        double price;
        int quantity;
        double total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy: ");
        item = scanner.nextLine();
        System.out.println("What is the price per item? ");
        price = scanner.nextDouble();
        System.out.println("How many would you like to buy?");
        quantity = scanner.nextInt();
        total = price * quantity;

        System.out.println("Your total would be: " + total);
        System.out.println("\nYou have bought " + quantity + " " + item);
    }
}
