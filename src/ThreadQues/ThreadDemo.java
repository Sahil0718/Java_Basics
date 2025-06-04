package ThreadQues;

import java.awt.geom.Area;

public class ThreadDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        InputThread input = new InputThread(rect);
        AreaThread area = new AreaThread(rect);
        PerimeterThread peri = new PerimeterThread(rect);

        input.start();

        //Wait for the input thread to complete
        try {
            input.join(); //ensures the input completes before proceeding
        } catch (InterruptedException e) {
            System.out.println("Input Thread Interrupted!");
        }
        area.start();
        peri.start();
    }
}
