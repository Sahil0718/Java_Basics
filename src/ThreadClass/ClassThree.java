package ThreadClass;

public class ClassThree extends Thread {
    //First Task

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * task completed");
    }
}
