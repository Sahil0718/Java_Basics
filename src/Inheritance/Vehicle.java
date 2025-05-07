package Inheritance;

public class Vehicle {
    public int noOfTyres;

    public void setNoOfTyres(int noOfTyres) { //setter method in java
        this.noOfTyres = noOfTyres;
    }

    public void commute() { //methods creates(behavior)
        System.out.printf("I am going from Bansbari to Budhanilkantha using %d tires!", noOfTyres);
    }
}