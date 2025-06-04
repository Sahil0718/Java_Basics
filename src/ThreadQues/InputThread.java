package ThreadQues;

import java.util.Scanner;

public class InputThread extends Thread {
    Rectangle rectangle;

    public InputThread(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        float length = sc.nextFloat();
        System.out.println("Enter the breadth:");
        float breadth = sc.nextFloat();
        rectangle.SetData(length, breadth);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Input Thread Interrupted!");
        }
    }

}