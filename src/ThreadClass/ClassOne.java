package ThreadClass;

public class ClassOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("Task has been completed!");
    }
}
