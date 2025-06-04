package ThreadQues;

public class PerimeterThread extends Thread {
    Rectangle rectangle;

    public PerimeterThread(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Perimeter thread is interrupted!");
        }

        float perimeter = rectangle.getPerimeter();
        System.out.println("The perimeter of rectangle is:"+perimeter);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Perimeter thread interrupted after sleep!");
        }
    }
}
