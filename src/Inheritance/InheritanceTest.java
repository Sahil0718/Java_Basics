package Inheritance;

public class InheritanceTest{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.noOfTyres = 4;

        twoWheeler two = new twoWheeler();
        v1.commute();
        System.out.println();
        two.commute();
    }
}