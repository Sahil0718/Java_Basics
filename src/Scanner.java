public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine(); //to write a value
        System.out.println("Goodnight!\t" + name);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);
    }
}