package ThreadQues;

import java.util.Scanner;

public class AreaThread extends Thread {
    Rectangle rectangle;

    public AreaThread(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void run() {
        //This ensures the input is likely complete
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Area Thread Interrupted!");
        }

        float area = rectangle.getArea();
        System.out.println("The area of rectangle is:"+ area);

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Area Thread Interrupted after sleep!");
        }
    }
}
