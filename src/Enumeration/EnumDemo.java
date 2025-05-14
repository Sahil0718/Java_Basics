package Enumeration;

//Enumeration means listing of things.
public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(Days.Monday);

        Days Monday = Days.Monday;
        int ordinal = Monday.ordinal();
        System.out.println(ordinal);

        System.out.println(Monday.name().toUpperCase());
    }
}