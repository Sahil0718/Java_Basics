import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("Let's do Swapping");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a = input.nextInt();
        System.out.println("Enter the value of B:");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("The Swapping is hence done!");
        System.out.println("The value of A is: " + a);
        System.out.println("The value of B is: " + b);
    }
}
